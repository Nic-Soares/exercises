def translate(text):
    vowels = 'aeiou'
    begins = ["xr", "yt"]

    def translate_word(word):
        # Regra 1: Se a palavra começar com uma vogal, ou com "xr" ou "yt"
        if word[0] in vowels or any(word.startswith(prefix) for prefix in begins):
            return word + 'ay'

        # Regra 3: Se a palavra começar com consoantes seguidas de "qu"
        if 'qu' in word:
            qu_index = word.index('qu')
            return word[qu_index + 2:] + word[:qu_index + 2] + 'ay'

        # Regra 2: Se a palavra começar com uma ou mais consoantes
        for i, letter in enumerate(word):
            if letter in vowels:
                return word[i:] + word[:i] + 'ay'

        # Regra 4: Se a palavra começar com "y" ou "y" estiver no final de um grupo de consoantes
        for i, letter in enumerate(word):
            if letter == 'y':
                if i == 0:
                    return word + 'ay'  # y treated as a consonant at the start
                else:
                    return word[i:] + word[:i] + 'ay'  # y treated as a vowel after consonants

        # Caso nenhuma regra anterior se aplique
        return word + 'ay'

    # Processa cada palavra no texto
    words = text.split()
    new_text = [translate_word(word) for word in words]

    return ' '.join(new_text)
