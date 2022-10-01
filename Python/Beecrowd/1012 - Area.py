"""
Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C.
Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
Entrada
O arquivo de entrada contém três valores com um dígito após o ponto decimal.

Saída
O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas
acima, sempre com mensagem correspondente e um espaço entre os dois pontos e o valor.
O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal.
"""

values = input().split()

A, B, C = values
pi = 3.14159

right_triangle = (float(A) * float(C) / 2)
area_cicle = pi * float(C) ** 2
trapezoid = ((float(A) + float(B)) * float(C)) / 2
square = float(B) * float(B)
rectangle = float(A) * float(B)

print('TRIANGULO: {:.3f}'.format(right_triangle))
print('CIRCULO: {:.3f}'.format(area_cicle))
print('TRAPEZIO: {:.3f}'.format(trapezoid))
print('QUADRADO: {:.3f}'.format(square))
print('RETANGULO: {:.3f}'.format(rectangle))

"""
PROBLEMA: 1012 - Área
RESPOSTA: Accepted
LINGUAGEM: Python 3.9 (Python 3.9.4) [+1s] {beta}
TEMPO: 0.186s
TAMANHO: 483 Bytes
MEMÓRIA: -
SUBMISSÃO: 13/02/2022 00:15:59
"""