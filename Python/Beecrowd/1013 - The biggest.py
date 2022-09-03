"""
Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem
“eh o maior”. Utilize a fórmula:

MaiorAB = (a + b + abs (a-b) / 2

Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é
necessário para chegar no resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
"""

import math

[A, B, C] = input().split()
A = int(A)
B = int(B)
C = int(C)
maior = max(A, B, C)
print(maior, 'eh o maior')

"""
SUBMISSÃO # 26264388
PROBLEMA: 1013 - O Maior
RESPOSTA: Accepted
LINGUAGEM: Python 3.9 (Python 3.9.4) [+1s] {beta}
TEMPO: 0.079s
TAMANHO: 128 Bytes
MEMÓRIA: -
SUBMISSÃO: 13/02/2022 22:03:25
"""