import math
import pygame
from pygame.locals import *
from random import randint

# Definição da classe Asteroide
class Asteroide:
    def __init__(self, numero, x, y, raio, cor):
        self.numero = numero
        self.x = x
        self.y = y
        self.raio = raio
        self.cor = cor
        self.vel_x = randint(-3, 3)
        self.vel_y = randint(-3, 3)
        self.explodindo = False
        self.paralisado = False
        self.tempo_paralisado = 0  # Tempo em milissegundos

# Função para verificar colisão entre dois asteroides
def colisao(ast1, ast2):
    distancia = math.sqrt((ast1.x - ast2.x)**2 + (ast1.y - ast2.y)**2)
    if (ast1.raio + ast2.raio) >= distancia:
        return True
    else:
        return False

# Função para criar asteroides sem duplicação
def criar_asteroides(num_asteroides, largura, altura):
    asteroides = []
    for i in range(num_asteroides):
        while True:
            raio = randint(10, 30)
            x = randint(raio, largura - raio)
            y = randint(raio, altura - raio)
            cor = RED if raio < 20 else BLUE
            asteroide = Asteroide(i + 1, x, y, raio, cor)
            duplicado = False
            for ast in asteroides:
                if colisao(ast, asteroide):
                    duplicado = True
                    break
            if not duplicado:
                asteroides.append(asteroide)
                break
    return asteroides

# Inicialização do pygame
pygame.init()

# Configurações da janela
screen_width, screen_height = 800, 600
screen = pygame.display.set_mode((screen_width, screen_height))
pygame.display.set_caption('Asteroides')

# Cores
WHITE = (255, 255, 255)
RED = (255, 0, 0)
BLUE = (0, 0, 255)
EXPLOSION_COLOR = (255, 255, 0)

# Criação dos asteroides
num_asteroides = 10
asteroides = criar_asteroides(num_asteroides, screen_width, screen_height)

# Loop principal do jogo
running = True
clock = pygame.time.Clock()

while running:
    for event in pygame.event.get():
        if event.type == QUIT:
            running = False

    # Atualiza a posição dos asteroides e verifica colisão com a borda
    for asteroide in asteroides:
        if not asteroide.paralisado:
            asteroide.x += asteroide.vel_x
            asteroide.y += asteroide.vel_y

            if asteroide.x - asteroide.raio < 0 or asteroide.x + asteroide.raio > screen_width:
                asteroide.vel_x = -asteroide.vel_x

            if asteroide.y - asteroide.raio < 0 or asteroide.y + asteroide.raio > screen_height:
                asteroide.vel_y = -asteroide.vel_y

    # Limpa a tela
    screen.fill(WHITE)

    # Verifica a colisão entre os asteroides
    for i in range(len(asteroides)):
        for j in range(i + 1, len(asteroides)):
            if not asteroides[i].explodindo and not asteroides[j].explodindo and colisao(asteroides[i], asteroides[j]):
                print(f'Colisão entre {asteroides[i].numero} e {asteroides[j].numero}')
                asteroides[i].cor = EXPLOSION_COLOR
                asteroides[j].cor = EXPLOSION_COLOR
                asteroides[i].explodindo = True
                asteroides[j].explodindo = True
                asteroides[i].paralisado = True
                asteroides[j].paralisado = True

    # Atualiza o tempo paralisado dos asteroides
    for asteroide in asteroides:
        if asteroide.paralisado:
            asteroide.tempo_paralisado += clock.get_time()
            if asteroide.tempo_paralisado > 1000:  # 1000 milissegundos (1 segundo)
                asteroides.remove(asteroide)

    # Desenha os asteroides
    for asteroide in asteroides:
        pygame.draw.circle(screen, asteroide.cor, (asteroide.x, asteroide.y), asteroide.raio)
        font = pygame.font.Font(None, 36)
        text = font.render(str(asteroide.numero), True, (0, 0, 0))
        screen.blit(text, (asteroide.x - 10, asteroide.y - 10))

    # Atualiza a tela
    pygame.display.flip()
    clock.tick(30)

# Encerra o pygame
pygame.quit()
