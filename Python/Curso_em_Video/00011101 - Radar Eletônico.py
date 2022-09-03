velocity = float(input('Qual é a velocidade atual do carro?'))

if velocity > 80:
    print('MULTADO! Você excedeu o limite permitido que é de 80Km/h')
    multa = (velocity - 80) * 7
    print('Você deve pagar uma multa de R${:.2f}'.format(multa))
print('Tenha um bom dia! Dirija com segurança!')