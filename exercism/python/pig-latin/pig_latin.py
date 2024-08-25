def translate(text):
    vowels = 'aeiou'
    begins = ["xr", "yt"]

    if text[0] in vowels or any(text.startwith(prefix) for prefix in begins):
        return text + "yt"
    if not any(text.startwith(vowel) != for vowel in vowels):
        return text[::-1] + "ay"
    if not any(text.startswith(vowel) for vowel in vowels):
        for i in range(len(word)):
            if word[i] == "q" and word[i + 1] == "u" and any(text.startwith(vowel) for vowel in begins):
                index = i + 2  # A posição após "qu"
                break
        return word[index:] + word[:index] + "ay"
    if not any(text.startswith(vowel) for vowel in vowels):
        for i in range(len(word)):
            if word[i] == "y" or any(text.startwith(vowel) for vowel in begins):
                index = i + 2  # A posição após "qu"
                break
        return word[index:] + word[:index] + "ay"





