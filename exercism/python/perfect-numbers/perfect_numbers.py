def classify(number):
    """ A perfect number equals the sum of its positive divisors.

    :param number: int a positive integer
    :return: str the classification of the input integer
    """
    
    aliquot = 0
    
    if number <= 0:
        raise ValueError("Classification is only possible for positive integers.")
    
    for i in range(1, number // 2 + 1):  # Itera até metade do número
        if number % i == 0:
            aliquot += i
    
    if aliquot == number:
        return "perfect"
    elif aliquot > number:
        return "abundant"
    else:
        return "deficient"
