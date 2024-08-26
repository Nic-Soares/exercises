def translate(text):
    vowels = 'aeiou'
    begins = ["xr", "yt"]
    
    words = text.split()
    new_text = []
    consoants = []

    for word in words:
        # Se a palavra começa com uma vogal ou um prefixo especial
        if word[0] in vowels or any(word.startswith(prefix) for prefix in begins):
            new_text.append(word + "ay")

        if not word[0] in vowels:
            for index in range(len(range)):
                if not word[index] in vowels:
                    consoants.append(word[index])


    return ' '.join(new_text)
