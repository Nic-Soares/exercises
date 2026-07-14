def shell_sort(lista):
    n = len(lista)
    gap = n // 2  # gap inicial = metade do tamanho

    while gap > 0:
        for i in range(gap, n):
            temp = lista[i]
            j = i
            # Desloca elementos anteriores para frente enquanto maior que temp
            while j >= gap and lista[j - gap] > temp:
                lista[j] = lista[j - gap]
                j -= gap
            lista[j] = temp
        gap //= 2  # reduz o gap pela metade

    return lista


if __name__ == "__main__":
    # Teste
    lista = [15, 167, 6, 1, 43, 0, 54, 9, 4]
    print('Original:', lista)
    print('Ordenada:', shell_sort(lista))
