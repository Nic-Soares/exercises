import math
import pygame
from pygame.locals import *
from random import randint

class Asteroid:
    def __init__(self, x, y, radius, acceleration_x, acceleration_y, color):
        self.x = x
        self.y = y
        self.radius = radius
        self.acceleration_x = acceleration_x
        self.acceleration_y = acceleration_y
        self.color = color
        self.frozen = False
        self.collision_time = 0

def check_collision(asteroid1, asteroid2):
    distance = math.sqrt((asteroid1.x - asteroid2.x)**2 + (asteroid1.y - asteroid2.y)**2)
    return (asteroid1.radius + asteroid2.radius) >= distance

def main():
    pygame.init()

    WIDTH, HEIGHT = 600, 400
    screen = pygame.display.set_mode((WIDTH, HEIGHT))
    pygame.display.set_caption('* A S T E R O I D S *')

    clock = pygame.time.Clock()
    FPS = 60

    n_asteroids = 20
    asteroids = generate_asteroids(n_asteroids)

    while True:
        handle_events()
        move_asteroids(asteroids, WIDTH, HEIGHT)
        screen.fill((0, 0, 0))
        handle_collisions(asteroids)
        draw_asteroids(screen, asteroids)
        pygame.display.flip()
        clock.tick(FPS)

    pygame.quit()

def generate_asteroids(n):
    size = [randint(5, 25), randint(5, 30), randint(5, 15)]
    colors = [(randint(0, 255), randint(0, 255), randint(0, 255)) for _ in range(3)]
    return [Asteroid(randint(10, 590), randint(10, 390), size[i % 3], randint(1, 2), randint(1, 2), colors[i % 3])
            for i in range(n)]

def handle_events():
    for event in pygame.event.get():
        if event.type == QUIT:
            pygame.quit()
            quit()

def move_asteroids(asteroids, WIDTH, HEIGHT):
    for asteroid in asteroids:
        if not asteroid.frozen:
            asteroid.x += asteroid.acceleration_x
            asteroid.y += asteroid.acceleration_y

            if asteroid.x < 0 or asteroid.x > WIDTH:
                asteroid.acceleration_x = -asteroid.acceleration_x
            if asteroid.y < 0 or asteroid.y > HEIGHT:
                asteroid.acceleration_y = -asteroid.acceleration_y

def handle_collisions(asteroids):
    current_time = pygame.time.get_ticks()

    for i, asteroid1 in enumerate(asteroids[:-1]):
        for asteroid2 in asteroids[i + 1:]:
            if not asteroid1.frozen and not asteroid2.frozen and check_collision(asteroid1, asteroid2):
                asteroid1.color = (randint(0, 255), randint(0, 255), randint(0, 255))
                asteroid2.color = (randint(0, 255), randint(0, 255), randint(0, 255))
                asteroid1.frozen = True
                asteroid2.frozen = True
                asteroid1.collision_time = current_time
                asteroid2.collision_time = current_time

    for asteroid in asteroids:
        if asteroid.frozen and current_time - asteroid.collision_time > 1000:  # 1000 milliseconds = 1 second
            asteroids.remove(asteroid)

def draw_asteroids(screen, asteroids):
    for asteroid in asteroids:
        pygame.draw.circle(screen, asteroid.color, (asteroid.x, asteroid.y), asteroid.radius)

if __name__ == "__main__":
    main()
