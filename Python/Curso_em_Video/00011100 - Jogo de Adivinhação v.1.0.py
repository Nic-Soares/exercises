from random import randint
from time import sleep
computer = randint(0, 5)
print('-=-' * 20)
print('Vou pensar em um número entre 0 e 5. Tente advinhar...')
print('-=-' * 20)
player = int(input('Em que número eu pensei? '))
print('PROCESSANDO...')
sleep(2)
if player == computer:
    print('Você acertou!!!')
else:
    print('Você errou, eu pensei no {}'.format(computer))