import pygame, sys
from pygame.locals import *
import os

# Obtenha o diretório do script atual
diretorio_atual = os.path.dirname(os.path.abspath(__file__))

diretorio_static = os.path.join(diretorio_atual, 'static/')

pygame.init()

FPS = 30 # frames per second setting
fpsClock = pygame.time.Clock()

# set up the window
DISPLAYSURF = pygame.display.set_mode((400, 300), 0, 32)
pygame.display.set_caption('Animation')

WHITE = (255, 255, 255)
catImg = pygame.image.load(os.path.join(diretorio_static, 'cat.png'))
catx = 10
caty = 10
direction = 'right'

while True: # the main game loop
    #DISPLAYSURF.fill(WHITE)

    if direction == 'right':
        catx += 5
        if catx == 280:
            direction = 'down'
    elif direction == 'down':
        caty += 5
        if caty == 220:
            direction = 'left'
    elif direction == 'left':
        catx -= 5
        if catx == 10:
            direction = 'up'
    elif direction == 'up':
        caty -= 5
        if caty == 10:
            direction = 'right'


    DISPLAYSURF.fill(WHITE)
    DISPLAYSURF.blit(catImg, (catx, caty))

    for event in pygame.event.get():
        if event.type == QUIT:
            pygame.quit()
            sys.exit()

    pygame.display.update()
    fpsClock.tick(FPS)
