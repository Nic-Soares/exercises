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
tank = pygame.image.load('src/static/tank_new.png').convert()

# Inicializa a posição do tanque
x = screen_width // 2
y = screen_height // 2

running = True
while running:
    for event in pygame.event.get():
        if event.type == QUIT:
            running = False

    # Captura a posição atual do mouse
    mouse_x, mouse_y = pygame.mouse.get_pos()

    # Calcula a diferença entre a posição do mouse e a posição do tanque
    move_x = mouse_x - x
    move_y = mouse_y - y

    # Normaliza o vetor de movimento para manter uma velocidade constante
    length = max(1, (move_x ** 2 + move_y ** 2) ** 0.5)
    move_x /= length
    move_y /= length

    # Atualiza a posição do tanque com base no movimento do mouse
    x += move_x * 5  # 5 é a velocidade do tanque
    y += move_y * 5

    # Arredonda os valores de x e y para inteiros
    x = round(x)
    y = round(y)

    screen.fill(White)
    screen.blit(tank, (x, y))

    pygame.display.update()

pygame.quit()
exit()
