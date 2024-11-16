def find(search_list, value):
    # Certifique-se de que a lista está ordenada
    search_list.sort()

    # Inicializa os limites da busca
    left = 0
    right = len(search_list) - 1

    # Loop enquanto houver elementos para verificar
    while left <= right:
        # Calcula o índice do meio
        middle_index = (left + right) // 2
        middle_value = search_list[middle_index]

        # Verifica se encontramos o valor
        if middle_value == value:
            return middle_index  # Retorna o índice do valor encontrado
        elif middle_value < value:
            left = middle_index + 1  # Ajusta para a metade direita
        else:
            right = middle_index - 1  # Ajusta para a metade esquerda

    # Se o loop terminar, o valor não está na lista
    raise ValueError("value not in array")
