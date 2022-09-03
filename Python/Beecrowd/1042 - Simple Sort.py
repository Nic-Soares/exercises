'''
Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores em ordem crescente, uma linha em branco e em seguida, os valores na sequência como foram lidos.

Entrada
A entrada contem três números inteiros.

Saída
Imprima a saída conforme foi especificado.
'''

order = values = input().split()
new_values = []

for i in values:
    new_values.append(int(i))

first = min(new_values)
new_values.remove(min(new_values))
thirt = max(new_values)
new_values.remove(max(new_values))

print(first)
print(new_values[0])
print(thirt)
print("")
print(order[0])
print(order[1])
print(order[2])