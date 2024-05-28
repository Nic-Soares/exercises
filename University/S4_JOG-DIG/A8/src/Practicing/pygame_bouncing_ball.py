import sys
import pygame
from pygame.locals import *
from random import randint

pygame.init()

BLACK = (0, 0, 0)
WHITE = (255, 255, 255)
WIDTH, HEIGHT = 800, 600

class Game:
    def __init__(self):
        self.size = (WIDTH, HEIGHT)
        self.screen = pygame.display.set_mode(self.size)
        pygame.display.set_caption("Papa Bolinhas")

        self.clock = pygame.time.Clock()

        self.font = pygame.font.SysFont('sans', 40)
        self.placar = 0

        self.posicao_papa_bolinhas = [400, 300]
        self.velocidade_papa_bolinhas = 5

        self.create_red_circle = True
        self.x_vermelho = randint(40, 760)
        self.y_vermelho = -20  # Começa acima da tela
        self.direcao_vermelha = 1
        self.bouncing = False  # Nova variável para controlar se está no modo "bouncing"

        self.temporizador = 60
        self.CLOCKTICK = pygame.USEREVENT + 1
        pygame.time.set_timer(self.CLOCKTICK, 1000)

        self.load_assets()

    def load_assets(self):
        self.imagem = pygame.image.load("/home/nicolas/Projects/exercises/University/S4/JOG_DIG/A8/image/imagem_fundo.png")
        self.catch_sound = pygame.mixer.Sound('/home/nicolas/Projects/exercises/University/S4/JOG_DIG/A8/sound/catch.mp3')

    def run(self):
        while True:
            self.handle_events()
            self.update()
            self.render()
            self.clock.tick(60)

    def handle_events(self):
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                pygame.quit()
                sys.exit()

            if event.type == self.CLOCKTICK:
                self.temporizador -= 1

        if self.temporizador == 0:
            pygame.quit()
            sys.exit()

    def update(self):
        pressed = pygame.key.get_pressed()
        self.update_position(pressed)
        self.update_red_circle()

    def update_position(self, pressed):
        if pressed[pygame.K_UP]: self.posicao_papa_bolinhas[1] -= self.velocidade_papa_bolinhas
        if pressed[pygame.K_DOWN]: self.posicao_papa_bolinhas[1] += self.velocidade_papa_bolinhas
        if pressed[pygame.K_LEFT]: self.posicao_papa_bolinhas[0] -= self.velocidade_papa_bolinhas
        if pressed[pygame.K_RIGHT]: self.posicao_papa_bolinhas[0] += self.velocidade_papa_bolinhas

    def update_red_circle(self):
        if self.create_red_circle:
            self.x_vermelho = randint(40, 760)
            self.y_vermelho = -20  # Começa acima da tela
            self.create_red_circle = False
            self.bouncing = False  # Reseta para não estar no modo "bouncing"

        if not self.bouncing:
            self.y_vermelho += 5 * self.direcao_vermelha

            if self.y_vermelho > HEIGHT:
                self.create_red_circle = True
                self.bouncing = False

            # Detecção de colisão
            distancia = ((self.posicao_papa_bolinhas[0] - self.x_vermelho) ** 2 +
                         (self.posicao_papa_bolinhas[1] - self.y_vermelho) ** 2) ** 0.5

            if distancia < 30:  # Ajuste conforme necessário para o raio das bolas
                self.create_red_circle = True
                self.placar += 1
                self.catch_sound.play()
                self.bouncing = True  # Entra no modo "bouncing"

    def render(self):
        self.screen.blit(self.imagem, (0, 0))
        pygame.draw.circle(self.screen, (255, 255, 255), self.posicao_papa_bolinhas, 20)
        pygame.draw.circle(self.screen, (255, 0, 0), [self.x_vermelho, int(self.y_vermelho)], 10)

        score_text = self.font.render('Placar ' + str(self.placar), True, (255, 255, 255))
        self.screen.blit(score_text, (600, 50))

        timer_text = self.font.render('Tempo ' + str(self.temporizador), True, (255, 255, 0))
        self.screen.blit(timer_text, (50, 50))

        pygame.display.flip()

if __name__ == "__main__":
    game = Game()
    game.run()
