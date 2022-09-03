"""
Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o
valor a ser pago.

Entrada
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois
inteiros e um valor com 2 casas decimais.

Saída
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após
os dois pontos e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.
"""

piece1 = input().split()
piece2 = input().split()

cod1, qtde1, value1 = piece1
cod2, qtde2, value2 = piece2

total = (int(qtde1) * float(value1)) + (int(qtde2) * float(value2))

print('VALOR A PAGAR: R$ {:.2f}'.format(total))

"""
SUBMISSÃO # 26254455
PROBLEMA: 1010 - Cálculo Simples
RESPOSTA: Accepted
LINGUAGEM: Python 3.9 (Python 3.9.4) [+1s] {beta}
TEMPO: 0.297s
TAMANHO: 234 Bytes
MEMÓRIA: -
SUBMISSÃO: 12/02/2022 23:46:47
"""