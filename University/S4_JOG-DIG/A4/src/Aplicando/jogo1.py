'''
    A partir do código disponibilizado no Professor Resolve, importe um novo Sprite do peixe (tendo, agora, dois peixes na tela), movimente-os na tela, simulando que eles estejam nadando como em um aquário. Lembre-se de que os peixes não podem sair da tela.

    Aplique um novo fundo à sua tela, simulando um aquário real.

    Faça bolhas subirem do fundo até a parte superior do aquário. Lembre-se de que bolhas executam um movimento irregular na água e que podem ser de diferentes tamanhos.
'''

import pygame
import os
from pygame.locals import *
from sys import exit
from gameobjects.vector2 import Vector2
import random

# Inicialize o Pygame e crie uma janela temporária
pygame.init()
pygame.display.set_mode((1, 1))  # Crie uma janela temporária de 1x1

# Obtenha o diretório do script atual
diretorio_atual = os.path.dirname(os.path.abspath(__file__))
diretorio_static = os.path.join(diretorio_atual, 'static/')

background_image_filename = os.path.join(diretorio_static, 'aquarium.jpeg')
sprite_image_filename = os.path.join(diretorio_static, 'fish.png')
sprite2_image_filename = os.path.join(diretorio_static, 'fish_blue.png')

# Carregue a imagem de fundo para obter suas dimensões
background = pygame.image.load(background_image_filename).convert()
background_width, background_height = background.get_size()

# Defina o tamanho da janela com base nas dimensões da imagem de fundo
screen = pygame.display.set_mode((background_width, background_height), 0, 32)

# Carregue as outras imagens
sprite = pygame.image.load(sprite_image_filename).convert_alpha()
sprite2 = pygame.image.load(sprite2_image_filename).convert_alpha()

clock = pygame.time.Clock()

position = Vector2(100.0, 100.0)
position2 = Vector2(200.0, 200.0)
speed = 250
heading = Vector2()

class Peixe:
    def __init__(self, image, initial_position):
        self.image = image
        self.position = initial_position
        self.heading = Vector2()

    def update(self, destination, speed, time_passed):
        if destination:
            self.heading = Vector2.from_points(self.position, destination)
            self.heading.normalize()

        distance_moved = time_passed * speed
        self.position += self.heading * distance_moved

        # Certifique-se de que o peixe não saia da tela
        self.position.x = max(0, min(self.position.x, screen.get_width() - self.image.get_width()))
        self.position.y = max(0, min(self.position.y, screen.get_height() - self.image.get_height()))

    def draw(self, screen):
        screen.blit(self.image, (self.position.x, self.position.y))

class Bolha:
    def __init__(self, x, y, radius, speed):
        self.x = x
        self.y = y
        self.radius = radius
        self.speed = speed
        self.color = (0, 152, 176)  # Cor #0098b0

    def update(self):
        self.y -= self.speed

    def draw(self, screen):
        pygame.draw.circle(screen, self.color + (200,), (int(self.x), int(self.y)), self.radius)

# Lista para armazenar as bolhas
bubbles = []

def criar_bolha():
    x = random.randint(0, screen.get_width())
    y = random.randint(0, screen.get_height() - 50)  # Ajuste para evitar a parte inferior
    radius = random.randint(5, 20)
    speed = random.uniform(0.1, 0.5)
    bolha = Bolha(x, y, radius, speed)
    bubbles.append(bolha)

# Crie dois objetos de peixe
peixe1 = Peixe(sprite, Vector2(100, 100))
peixe2 = Peixe(sprite2, Vector2(200, 200))

destination = None  # Inicialize 'destination'

while True:
    for event in pygame.event.get():
        if event.type == QUIT:
            pygame.quit()
            exit()
        if event.type == MOUSEBUTTONDOWN:
            destination_x = event.pos[0] - sprite.get_width()/2.0
            destination_y = event.pos[1] - sprite.get_height()/2.0
            destination = (destination_x, destination_y)  # Defina 'destination'

    screen.blit(background, (0, 0))

    # Atualize e desenhe os peixes
    time_passed = clock.tick()
    time_passed_seconds = time_passed / 1000.0

    peixe1.update(destination, speed, time_passed_seconds)
    peixe2.update(destination, speed, time_passed_seconds)

    peixe1.draw(screen)
    peixe2.draw(screen)

    # Criar novas bolhas aleatoriamente
    if random.random() < 0.02:
        criar_bolha()

    # Atualizar e desenhar as bolhas
    for bolha in bubbles:
        bolha.update()
        bolha.draw(screen)

    pygame.display.update()
