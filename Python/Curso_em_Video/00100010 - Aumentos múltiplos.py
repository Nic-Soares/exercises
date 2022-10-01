salary = float(input('Qual seu salario? '))

if salary <= 1250:
    new = salary + (salary * 15 / 100)
else:
    new = salary + (salary * 10 / 100)

print('Quem ganhava R${:.2f} passa a ganhar R${:.2f} agora'.format(salary, new))