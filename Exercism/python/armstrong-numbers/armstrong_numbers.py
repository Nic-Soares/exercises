def is_armstrong_number(number):
    digits = str(number)

    power = len(digits)

    total = sum(int(digit) ** power for digit in digits)        

    return total == number
