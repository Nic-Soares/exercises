'''
Desafio

1. Crie uma tela com 6 retângulos que ocupem toda a tela. A cor de cada retângulo deve ser alterada continuamente através de uma função de lerp.
2. Altere o programa anterior para que as cores sejam alteradas de acordo com a movimentação do mouse sobre cada um dos retângulos. Quando o mouse se movimentar sobre um dos retângulos, somente a cor deste retângulo deve mudar em função da posição x, y do mouse.
'''

import pygame
import sys
import random

def main():
    pygame.init()

    screen_width = 800
    screen_height = 600
    screen = pygame.display.set_mode((screen_width, screen_height))
    pygame.display.set_caption("Desafio dos Retângulos Coloridos - TIA 22021221 - Nicolas")

    QtyRectangles = 6

    rectangles = generate_rectangles(screen_width, screen_height, QtyRectangles)
    colors_current = [(random_color(), random_color()) for i in range(QtyRectangles)]
    color_transition_progress = [0.0] * QtyRectangles

    transition_speed = 0.005

    clock = pygame.time.Clock()
    fps = 60

    running = True
    while running:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                running = False

        mouse_x, mouse_y = pygame.mouse.get_pos()  # Obtém a posição atual do mouse

        for i, rect in enumerate(rectangles):
            if rect.collidepoint(mouse_x, mouse_y):  # Verifica se o mouse está sobre o retângulo
                update_rectangles(rectangles, colors_current, color_transition_progress, transition_speed, i)

        draw_rectangles(screen, rectangles, colors_current, color_transition_progress)

        pygame.display.flip()
        clock.tick(fps)

    pygame.quit()
    sys.exit()

def lerp(value1, value2, factor):
    return value1 + (value2 - value1) * factor

def random_color():
    return (random.randint(0, 255), random.randint(0, 255), random.randint(0, 255))

def generate_rectangles(screen_width, screen_height, num_rectangles):
    return [pygame.Rect(i * (screen_width // num_rectangles), 0, screen_width // num_rectangles, screen_height) for i in range(num_rectangles)]

def update_rectangles(rectangles, colors_current, color_transition_progress, transition_speed, index):
    current_color, next_color = colors_current[index]
    color_progress = color_transition_progress[index]

    color_transition_progress[index] += transition_speed

    if color_progress >= 1.0:
        colors_current[index] = (next_color, random_color())
        color_transition_progress[index] = 0.0

def draw_rectangles(screen, rectangles, colors_current, color_transition_progress):
    for i, rect in enumerate(rectangles):
        current_color, next_color = colors_current[i]
        color_progress = color_transition_progress[i]

        r = int(lerp(current_color[0], next_color[0], color_progress))
        g = int(lerp(current_color[1], next_color[1], color_progress))
        b = int(lerp(current_color[2], next_color[2], color_progress))

        pygame.draw.rect(screen, (r, g, b), rect)

if __name__ == "__main__":
    main()




