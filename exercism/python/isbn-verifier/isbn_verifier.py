def is_valid(isbn):
    # Remover hífens
    isbn = isbn.replace("-", "")
    
    # Verificar se o tamanho é 10
    if len(isbn) != 10:
        return False
    
    # Calcular o checksum
    checksum = 0
    for indice, char in zip(range(10, 0, -1), isbn):
        if char.isdigit():
            checksum += int(char) * indice
        elif char == "X" and indice == 1:  # "X" só pode ser o último caractere e vale 10
            checksum += 10
        else:
            return False  # Caracter inválido
    
    # Verificar se o checksum é divisível por 11
    return checksum % 11 == 0

# Chamando a função com um nome de variável válido
result = is_valid("3-598-21508-8")
print(result)
