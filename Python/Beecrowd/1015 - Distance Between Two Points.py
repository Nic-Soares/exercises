'''
Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, segundo a fórmula:

Distancia = √(x2 - x1)^2 + (y2 - y1)^2

Entrada
O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de ponto flutuante: x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.

Saída
Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal.
'''

# import math
# x1,y1 = list(map(float, input().split()))                              
# x2,y2 = list(map(float, input().split()))
# distance = math.sqrt(pow(x2-x1,2) + pow(y2-y1,2))
# print(f'{distance:0.4f}')

import math

p1 = input().split()
p2 = input().split()

x1, y1 = p1
x2, y2 = p2

calc = math.sqrt(((float(x2) - float(x1)) ** 2) + ((float(y2) - float(y1)) ** 2))

print("{:.4f}".format(calc))