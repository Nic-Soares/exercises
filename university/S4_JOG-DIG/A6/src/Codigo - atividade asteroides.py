'''
1. Escreva uma função que receba dois asteroides (TAsteroide) por parâmetro e verifique se houve colisão. Se houver colisão, a função retorna True; caso contrário, retorna False.

2. Crie uma animação com pygame: elabore dez asteroides de tamanhos diferentes, armazenados em uma lista global; eles devem “vagar” pelo espaço (tela). Se houver colisão entre dois asteroides, faça um print no console informando quais deles colidiram.

Importante!

- Defina três tamanhos de asteroides, e “popule” a lista com asteroides dos três tamanhos.
- Utilize círculos para desenhar os asteroides na tela; cada tamanho pode ter uma cor diferente.
- Dentro do loop Game, provavelmente deverá haver um novo loop percorrendo toda a lista de asteroides para atualizar a nova posição de cada um deles.
'''

import math
import pygame
from pygame.locals import *
from random import randint 

class Asteroide:
    def __init__(self , x, y, raio):
        self.x = x
        self.y = y
        self.raio = raio


def colisao(ast1, ast2):
    distancia =  math.sqrt( ((ast1.x-ast2.x)**2)+((ast1.y-ast2.y)**2) )
    print('distancia: ', distancia)
    if (ast1.raio + ast2.raio) >= distancia:
        return True
    else:
        return False


asteroides = []
asteroides.append(Asteroide(180,180, 50))
asteroides.append(Asteroide(110,110, 50))


print(colisao(asteroides[0],asteroides[1]))

#importa a biblioteca pygame


#inicializa as módulos dessa biblioteca.
pygame.init()

#Seta o tamanho da janela
screen = pygame.display.set_mode((600,400))

#troca a cor da janela para branco
screen.fill((255,255,255))

colorCirc1 = (255,0,0)
colorCirc2 = (0,0,255)

pygame.draw.circle(screen, colorCirc1, (asteroides[0].x, asteroides[0].y), asteroides[0].raio, 1)
pygame.draw.circle(screen, colorCirc2, (asteroides[1].x, asteroides[1].y), asteroides[1].raio, 1)

while True:
    for event in pygame.event.get():
        if event.type == QUIT:
            pygame.quit()
            quit()
#atualiza a cor da janela
    pygame.display.flip()
