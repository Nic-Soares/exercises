def steps(number):
    count = 0

    if number <= 0:
        raise ValueError("Only positive integers are allowed")

    step_count = 0
    while number != 1:
        if number % 2 == 0:
            number //= 2  # divisão inteira
        else:
            number = number * 3 + 1
        
        step_count += 1
        
    return step_count