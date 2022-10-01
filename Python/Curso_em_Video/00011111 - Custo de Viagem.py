distance = float(input('Qual da distância da sua viagem? '))
print('Você está prestes a começar uma viagem de {} Km.'.format(distance))
if distance <= 200:
    price = distance * 0.50
else:
    price = distance * 0.45
print('E o preço da sua passagem será de R${:.2f}'.format(price))