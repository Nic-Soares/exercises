'''
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

[Tabela no site]

Entrada
O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.

Saída
O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.
'''

entry = input().split()
new_entry = []

for i in entry:
    new_entry.append(float(i))

cod = new_entry[0]
qtd = new_entry[1]

if cod == 1:
    value = float(qtd) * 4.00
    print("Total: R$ {:.2f}".format(value))

elif cod == 2:
    value = float(qtd) * 4.50
    print("Total: R$ {:.2f}".format(value))

elif cod == 3:
    value = float(qtd) * 5.00
    print("Total: R$ {:.2f}".format(value))

elif cod == 4:
    value = float(qtd) * 2.00
    print("Total: R$ {:.2f}".format(value))

elif cod == 5:
    value = float(qtd) * 1.50
    print("Total: R$ {:.2f}".format(value))