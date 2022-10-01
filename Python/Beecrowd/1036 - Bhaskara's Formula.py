'''
Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.

Entrada
Leia três valores de ponto flutuante (double) A, B e C.

Saída
Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo. Imprima sempre o final de linha após cada mensagem.
'''

import math

entry = input().split()

new_entry = []
for i in entry:
    new_entry.append(float(i))

A = new_entry[0]
B = new_entry[1]
C = new_entry[2]

delta = (B ** 2 - 4 * A * C)
div = 2 * A

if div == 0 or delta < 0:
    print("Impossivel calcular")

else:
    raiz = math.sqrt(delta)
    x1 = ((B * -1) + raiz) / div
    x2 = ((B * -1) - raiz) / div

    print("R1 = {:.5f}".format(x1))
    print("R2 = {:.5f}".format(x2))

# 10.0 20.1 5.1
