measure = input('What type of measurement do you want to convert?\nCentimeters(cm), Meters(m) or Kilometers(Km)\n')
print('\n')
convert = input('What type of measurement will it be converted to?\nCentimeters(cm), Meters(m) or Kilometers(Km)\n')
print('\n')
valor   = int(input("What's the distance?"))

print('\n')

print(measure)
print('to')
print(convert)

print('\n')

if measure == 'Meters' or 'm' and convert == 'Centimeters' or 'cm':
    calc = valor * 100

elif measure == 'Meters' or 'm' and convert == 'Kilometers' or 'Km':
    calc = valor / 1000

else:
    print('Algo'' deu errado!')

print(calc)