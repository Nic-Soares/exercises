def find_anagrams(word, candidates):
    word_lower = word.lower()
    sorted_word = sorted(word_lower)
    
    return [candidate for candidate in candidates
        if candidate.lower() != word_lower and sorted(candidate.lower()) == sorted_word]
