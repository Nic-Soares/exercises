import math
co1 = float(input('Comprimento do cateto oposto: '))
ca1 = float(input('Comprimento do cateto adjacente: '))
hi1 = math.hypot(co1, ca1)
print('A hipotenusa vai medir {:.2f}'.format(hi1))

#or

co = float(input('Comprimento do cateto oposto: '))
ca = float(input('Comprimento do cateto adjacente: '))
hi = (co ** 2 + ca ** 2) ** (1/2)
print('A hipotenusa vai medir {:.2f}'.format(hi))