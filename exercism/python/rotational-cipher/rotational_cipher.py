def rotate(text, key):
    result = []  # Lista para armazenar o texto cifrado

    for char in text:
        if char.isalpha():  # Verifica se o caractere é uma letra
            # Calcula o deslocamento dentro do alfabeto
            shift = (ord(char.lower()) - ord('a') + key) % 26
            new_char = chr(ord('a') + shift)  # Converte o valor deslocado de volta para letra

            if char.isupper():  # Se o caractere original era maiúsculo, ajusta a nova letra
                new_char = new_char.upper()
            result.append(new_char)  # Adiciona a letra cifrada ao resultado
        else:
            result.append(char)  # Mantém caracteres que não são letras (espaços, pontuação)

    return ''.join(result)  # Retorna o texto cifrado como string
