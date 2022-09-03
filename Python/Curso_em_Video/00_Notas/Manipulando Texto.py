frase = 'Curso em Video Python'

"""
Fatiamento de String
"""

print(frase[9:13])

print(frase[9:21])

print(frase[9:21:2])

print(frase[:5])

print(frase[15:])

print(frase[9::3])


"""
Análise
"""

#QUANTIDADE DE CARACTERES
print(len(frase))

#QUANTIDADE DE LETRAS ESPECIFICAS
print(frase.count('o', 0, 13))

#MOTRAR LOCALIZAÇAO
print(frase.find('deo'))

#QUANDO NAO LOCALIZA
print(frase.find('Android'))

#VERIFICA A DISPONIBILIDADE DENTRO DA FRASE
print('Curso' in frase)


"""
Transformaçao
"""

#SUBSTITUIÇAO SECUNDARIA (REPLACE)
print(frase.replace('Python', 'Android'))

#COLOCA LETRAS EM MAIUSCULO (UPPER)
print(frase.upper())

#COLOCA LETRAS EM MINUSCULA (LOWER)
print(frase.lower())

#COLOCA OS CARACTERES EM MAIUSSCULO MENOS O PRIMEIRO CARACTER(CAPITALIZE)
print(frase.capitalize())

#COLOCA CARACTERES INICIAS DE FRASES EM MAIUSCULO (TITLE)
print(frase.title())

frase2 = '   Aprenda Python  '

#REMOVE OS ESPAÇOS EXCEDENTES (strip)
print(frase2.strip())

#REMOVE OS ESPAÇOS SOMENTE OS ESPAÇOS DA DIREITA (RSTRIP)
print(frase2.rstrip())

#REMOVE OS ESPAÇOS SOMENTE OS ESPAÇOS DA DIREITA (RSTRIP)
print(frase2.lstrip())


"""
Divisao
"""

#SERA DIVIDO EM UMA LISTA
frase3 = frase.split()
print(frase3)


"""
Junçao
"""

print('-'.join(frase3))