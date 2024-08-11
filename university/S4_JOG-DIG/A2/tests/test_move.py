import pygame
from pygame.locals import *
from sys import exit

pygame.init()

# Screen config
screen_width = 800
screen_height = 800

# Pygame startup
screen = pygame.display.set_mode((screen_width, screen_height))
pygame.display.set_caption("Tank Moving")

# Colors
White = (255, 255, 255)

# Initial tank position
x = screen_width // 2
y = screen_height // 2

# Initial moving
move_x, move_y = 0,0

# Loading image tank
tank = pygame.image.load('src/static/tanque.jpg').convert()

clock = pygame.time.Clock()
running = True
while running:
    for event in pygame.event.get():
        if event.type == QUIT:
            running = False

        if event.type == KEYDOWN:
            if event.key == K_LEFT:
                move_x = -1
            elif event.key == K_RIGHT:
                move_x = 1
            elif event.key == K_UP:
                move_y = -1
            elif event.key == K_DOWN:
                move_y = 1

        if event.type == KEYUP:
            if event.key in (K_LEFT, K_RIGHT, K_UP, K_DOWN):
                move_x, move_y = 0, 0

    x += move_x
    y += move_y

    screen.fill(White)
    screen.blit(tank, (x, y))

    pygame.display.update()
    clock.tick(60)  # Limita a taxa de quadros a 60 por segundo

pygame.quit()
exit()