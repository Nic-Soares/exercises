def is_isogram(string):
    import re
    string = re.sub(r'[^a-zA-Z]', '', string).lower()  # Remove caracteres não alfabéticos e converte para minúsculas
    return len(string) == len(set(string))  # Verifica se a quantidade de letras únicas é igual ao comprimento da string