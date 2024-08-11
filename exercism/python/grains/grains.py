def square(number):
    if number < 1 or number > 64:
        raise ValueError("square must be between 1 and 64")
    return 2**(number -1)



def total():
    total_grains = sum(2**(square - 1) for square in range(1, 65))
    return total_grains
