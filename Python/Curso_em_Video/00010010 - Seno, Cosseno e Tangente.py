import math
angle = float(input('Digite o angulo que voce deseja: '))
sine = math.sin(math.radians(angle))
print('O angulo de {} tem o SENO de {:.2f}'.format(angle, sine))
cosine = math.cos(math.radians(angle))
print('O angulo de {} tem o COSSENO de {:.2f}'.format(angle, cosine))
tangent = math.tan(math.radians(angle))
print('O angulo de {} tem a TANGENTE de {:.2f}'.format(angle, tangent))