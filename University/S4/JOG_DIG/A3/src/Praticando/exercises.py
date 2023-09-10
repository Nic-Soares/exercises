'''
Exercícios:
1) Crie funções que retornem uma superfície de Retangulos e Circulos, passando como
parâmetro os valores necessários para cada forma geométrica (altura, largura, raio, cor,
posição inicial, etc)
2) Crie uma função que gere uma tupla de cores com valores aleatórios.
3) Desenhe na tela retângulos e círculos em posições, tamanho e cores aleatórias na tela,
usando os métodos criados nos itens anteriores.
'''
import pygame
import random

# Inicialize o pygame
pygame.init()

# Defina as dimensões da janela
screen_width = 800
screen_height = 600

# Crie a janela de exibição
screen = pygame.display.set_mode((screen_width, screen_height))
pygame.display.set_caption("Desenhar Retângulos e Círculos Aleatórios - TIA 22021221 - Nicolas")

# Função para criar uma superfície retangular
def create_rectangle(width, height, color, x=0, y=0):
    surface = pygame.Surface((width, height))
    surface.fill(color)
    return surface, (x, y)

# Função para criar uma superfície de círculo
def create_circle(radius, color, x=0, y=0):
    surface = pygame.Surface((radius * 2, radius * 2), pygame.SRCALPHA)
    pygame.draw.circle(surface, color, (radius, radius), radius)
    return surface, (x, y)

# Função para gerar uma cor aleatória
def random_color():
    return (random.randint(0, 255), random.randint(0, 255), random.randint(0, 255))

# Função para desenhar objetos aleatórios na tela
def draw_random_objects():
    objects = []
    for i in range(10):  # Desenha 10 objetos aleatórios
        shape_type = random.choice(["rectangle", "circle"])
        color = random_color()
        x = random.randint(0, screen_width)
        y = random.randint(0, screen_height)
        
        if shape_type == "rectangle":
            width = random.randint(20, 200)
            height = random.randint(20, 200)
            surface, position = create_rectangle(width, height, color, x, y)
        else:
            radius = random.randint(10, 50)
            surface, position = create_circle(radius, color, x, y)
        
        objects.append((surface, position))
    
    return objects


# Configuração do clock para controlar a taxa de quadros por segundo (FPS)
clock = pygame.time.Clock()
fps = 1  # Você pode ajustar a taxa de quadros por segundo conforme desejado

running = True
while running:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False

    # Limpe a tela
    screen.fill((255, 255, 255))

    # Desenhe objetos aleatórios na tela
    random_objects = draw_random_objects()
    for obj in random_objects:
        surface, position = obj
        screen.blit(surface, position)

    pygame.display.flip()

    # Limita a taxa de quadros por segundo (FPS)
    clock.tick(fps)

pygame.quit()
