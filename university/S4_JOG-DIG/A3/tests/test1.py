import pygame
import random

def initialize_pygame():
    pygame.init()

def create_screen(width, height):
    return pygame.display.set_mode((width, height))

def lerp_color(color1, color2, alpha):
    r1, g1, b1 = color1
    r2, g2, b2 = color2
    r = int(r1 + alpha * (r2 - r1))
    g = int(g1 + alpha * (g2 - g1))
    b = int(b1 + alpha * (b2 - b1))
    return (r, g, b)

def RandomColor():
    return (random.randint(0, 255), random.randint(0, 255), random.randint(0, 255))

def main():
    largura_tela = 800
    altura_tela = 600
    quantidade_retangulos = 6
    largura_retangulo = largura_tela // quantidade_retangulos
    altura_retangulo = altura_tela
    tela = create_screen(largura_tela, altura_tela)
    pygame.display.set_caption("Retângulos Preenchendo a Tela")

    cores_destino = [(RandomColor()), (RandomColor()), (RandomColor())]
    cores_atuais = [(0, 0, 0)] * quantidade_retangulos
    alpha = 0.0
    rodando = True

    while rodando:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                rodando = False

        tela.fill((255, 255, 255))

        for i in range(quantidade_retangulos):
            x = i * largura_retangulo
            y = 0
            cor_destino = cores_destino[i % len(cores_destino)]
            cor_atual = lerp_color(cores_atuais[i], cor_destino, alpha)
            pygame.draw.rect(tela, cor_atual, (x, y, largura_retangulo, altura_retangulo))
            cores_atuais[i] = cor_atual

        pygame.display.flip()

        alpha += 0.01
        if alpha >= 1.0:
            alpha = 0.0

    pygame.quit()

if __name__ == "__main__":
    initialize_pygame()
    main()
