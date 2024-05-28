import pygame
import os

# Inicialize o Pygame (configuração mínima para carregar imagens)
pygame.init()
pygame.display.set_mode((1, 1))  # Crie uma janela temporária

# Obtenha o diretório do script atual
diretorio_atual = os.path.dirname(os.path.abspath(__file__))
diretorio_static = os.path.join(diretorio_atual, 'static/')

background_image_filename = os.path.join(diretorio_static, 'aquarium.jpeg')
sprite_image_filename = os.path.join(diretorio_static, 'fish.png')
sprite2_image_filename = os.path.join(diretorio_static, 'fish_blue.png')

background = pygame.image.load(background_image_filename).convert()

# Obtém o tamanho da imagem de fundo
background_width, background_height = background.get_size()

print(background_height)
print(background_width)

# Encerre o Pygame
pygame.quit()
