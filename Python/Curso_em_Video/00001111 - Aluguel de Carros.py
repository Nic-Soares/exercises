days = int(input('How many days were rented?'))
km = float(input('How kilometers traveled?'))

price = (days * 60) + (km * 0.15)

print('O total a pagar é de R${:.2f}'.format(price))

