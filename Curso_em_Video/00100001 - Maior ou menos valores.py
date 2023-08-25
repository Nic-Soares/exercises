a = input('Primeiro valor: ')
b = input('Segundo valor: ')
c = input('Terceiro valor: ')

#VERIFICAR QUEM É MENOR

menor = a
if b < a and b < c:
    menor = b
if c < a and c < b:
    menor = c

print('O menor valor digitado foi {}'.format(menor))

# VERIFICAR QUEM É O MAIOR
maior = a
if b > a and b > c:
    maior = b
if c > a and c > b:
    maior = c

print('O maior valor digitado foi {}'.format(maior))