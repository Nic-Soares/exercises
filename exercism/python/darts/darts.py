def score(x, y):
    # Calcula a distânce do ponto (x, y) ao centro (0, 0)
    distance = (x**2 + y**2) ** 0.5

    # Verifica em qual região o dardo caiu e retorna a pontuação
    if distance > 10:
        return 0
    elif distance > 5:
        return 1
    elif distance > 1:
        return 5
    return 10


