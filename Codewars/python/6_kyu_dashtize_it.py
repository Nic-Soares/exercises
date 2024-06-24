'''
DESCRIPTION:
Given an integer, return a string with dash '-' marks before and after each odd digit, but do not begin or end the string with a dash mark.

Ex:

274 -> '2-7-4'
6815 -> '68-1-5'
'''

def dashatize(num):
    try:
        return ''.join(['-' + i + '-' if int(i) % 2 else i for i in str(abs(num))]).replace('--', '-').strip('-')
    except:
        return 'None'

# Solicitar entrada do usuário e imprimir o resultado
resultado = dashatize(int(input("Digite um número: ")))
print(resultado)

