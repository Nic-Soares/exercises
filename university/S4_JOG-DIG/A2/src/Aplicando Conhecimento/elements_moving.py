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

# Loading image tank
tank_original = pygame.image.load('src/static/tank_new.png').convert()
tank = tank_original  # Inicialmente, o tanque não está rotacionado

# Get the size of the tank image
tank_width, tank_height = tank_original.get_size()

# Initial tank position
x = (screen_width - tank_width) // 2
y = (screen_height - tank_height) // 2

# Initial moving
move_x, move_y = 0, 0

clock = pygame.time.Clock()
running = True
while running:
    for event in pygame.event.get():
        if event.type == QUIT:
            running = False

        if event.type == KEYDOWN:
            if event.key == K_LEFT:
                move_x = -1
                tank = pygame.transform.rotate(tank_original, 90)  # Volte à imagem original (apontando para a direita)
            elif event.key == K_RIGHT:
                move_x = 1
                tank = pygame.transform.rotate(tank_original, -90)  # Rotacione 180 graus para a esquerda
            elif event.key == K_UP:
                move_y = -1
                tank = pygame.transform.rotate(tank_original, 0)  # Rotacione 90 graus no sentido anti-horário (apontando para cima)
            elif event.key == K_DOWN:
                move_y = 1
                tank = pygame.transform.rotate(tank_original, -180)  # Rotacione 90 graus no sentido horário (apontando para baixo)

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
