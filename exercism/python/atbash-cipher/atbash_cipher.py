alphabet = "abcdefghijklmnopqrstuvwxyz"
invert_alphabet = "zyxwvutsrqponmlkjihgfedcba"


def encode(plain_text):

    new_text = ""
    plain_text = plain_text.lower()

    # Substituir caracteres
    for char in plain_text:
        if char in alphabet:
            index = alphabet.index(char)
            new_text += invert_alphabet[index]
        elif char.isdecimal():
            new_text += char
        # Ignorar outros caracteres

    # Agrupamento de 5 caracteres
    grouped_text = " ".join([new_text[i:i+5] for i in range(0, len(new_text), 5)])

    return grouped_text


def decode(ciphered_text):
    
    new_text = ""
    ciphered_text = ciphered_text.replace(' ', '')
    
    # Substituir caracteres
    for char in ciphered_text:
        if char in invert_alphabet:
            index = invert_alphabet.index(char)
            new_text += alphabet[index]
        elif char.isdecimal():
            new_text += char
    
    return new_text


