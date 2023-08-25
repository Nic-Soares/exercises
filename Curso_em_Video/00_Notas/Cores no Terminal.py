'''
ANSI

\033[style: text: back m]

style's:
0 = none
1 = Bold
4 = Underline
7 = Negative

text
30 = White
31 = Red
32 = Green
33 = Yellow
34 = Roial
35 = Roxo
36 = Ciano
37 = Cinza

back
40 = White
41 = Red
42 = Green
43 = Yellow
44 = Roial
45 = Roxo
46 = Ciano
47 = Cinza

'''
print('\033[1;31;43mOlá, Mundo!\033[m')

name = 'Nicolas'
cores = {'Limpa':'\033[m',
         'azul':'\033[34m',
         'amarelo':'\033[33m',
         'pretoebranco':'\033[7;30m'}
print('Olá! Muito prazer em te conhecer, {}{}{}!!'.format(cores['pretoebranco'], name, cores['Limpa']))
