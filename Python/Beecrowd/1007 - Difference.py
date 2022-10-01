"""
Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a
diferença do produto de A e B pelo produto de C e D segundo a fórmula:
DIFERENCA = (A * B - C * D).

Entrada
O arquivo de entrada contém 4 valores inteiros.

Saída
Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme
exemplo abaixo, com um espaço em branco antes e depois da igualdade.
"""

A = int(input())
B = int(input())
C = int(input())
D = int(input())
DIFERENCA = (A * B - C * D)

print('DIFERENCA = {}'.format(DIFERENCA))

"""
PROBLEMA: 1007 - Diferença
RESPOSTA: Accepted
LINGUAGEM: Python 3.9 (Python 3.9.4) [+1s] {beta}
TEMPO: 0.006s
TAMANHO: 144 Bytes
MEMÓRIA: -
SUBMISSÃO: 12/02/2022 13:19:22
"""