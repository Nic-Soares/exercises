def is_pangram(sentence):
    # Convert the sentence to lowercase and remove non-alphabetic characters
    # Converte a frase para minúsculas e remove caracteres não alfabéticos
    sentence = sentence.lower()
    letters = set(char for char in sentence if char.isalpha())
    
    # Check if there are 26 unique letters (all letters of the alphabet)
    # Verifica se há 26 letras únicas (todas as letras do alfabeto)
    return len(letters) == 26