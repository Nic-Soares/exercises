"""
Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas
por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
efetuadas, informar o total a receber no final do mês, com duas casas decimais.

Entrada
O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de dupla precisão
(double) com duas casas decimais, representando o salário fixo do vendedor e montante total das
vendas efetuadas por este vendedor, respectivamente.

Saída
Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.
"""

name = input('')
salary = float(input())
sales = float(input())
commission = salary + (sales * 15 / 100)

print('TOTAL = R$ {:.2f}'.format(commission))


"""
SUBMISSÃO # 26254396
PROBLEMA: 1009 - Salário com Bônus
RESPOSTA: Accepted
LINGUAGEM: Python 3.9 (Python 3.9.4) [+1s] {beta}
TEMPO: 0.065s
TAMANHO: 156 Bytes
MEMÓRIA: -
SUBMISSÃO: 12/02/2022 23:35:26
"""
