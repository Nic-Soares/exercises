import pygame
import sys
from pygame.locals import *

pygame.init()

FPS = 30  # frames per second setting
fpsClock = pygame.time.Clock()

# Configuração da janela
WIDTH, HEIGHT = 400, 300
DISPLAYSURF = pygame.display.set_mode((WIDTH, HEIGHT), 0, 32)
pygame.display.set_caption('Animation')

WHITE = (255, 255, 255)
catImg = pygame.image.load('/home/nicolas/Projects/exercises/University/S4/JOG_DIG/A5/examples/cat.png')
catx = 10
caty = 10
angle = 0  # ângulo de rotação
rotation_speed = 1  # velocidade de rotação
move_speed = 5  # velocidade de movimento

while True:  # O loop principal do jogo
    DISPLAYSURF.fill(WHITE)

    keys = pygame.key.get_pressed()

    for event in pygame.event.get():
        if event.type == QUIT:
            pygame.quit()
            sys.exit()

    # Verifique as teclas pressionadas e mova a imagem
    if keys[K_d]:
        catx += move_speed
    if keys[K_a]:
        catx -= move_speed
    if keys[K_s]:
        caty += move_speed
    if keys[K_w]:
        caty -= move_speed
    if keys[K_e]:
        angle = (angle + rotation_speed) % 360  # Rotacionar no sentido horário

    # Limite a posição da imagem para que ela não saia da janela
    catx = max(0, min(WIDTH - catImg.get_width(), catx))
    caty = max(0, min(HEIGHT - catImg.get_height(), caty))

    # Rotação da imagem
    rotated_cat = pygame.transform.rotate(catImg, angle)
    cat_rect = rotated_cat.get_rect()
    cat_rect.center = (catx + catImg.get_width() // 2, caty + catImg.get_height() // 2)

    DISPLAYSURF.blit(rotated_cat, cat_rect.topleft)

    pygame.display.update()
    fpsClock.tick(FPS)
