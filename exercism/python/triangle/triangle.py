def equilateral(sides):

    if len(sides) != 3 or any(side <= 0 for side in sides):
        return False
    
    return sides[0] == sides[1] == sides[2]


def isosceles(sides):

    if len(sides) != 3 or any(side <= 0 for side in sides):
        return False
    
    a, b, c = sides
    if a + b <= c or a + c <= b or b + c <= a:
        return False

    return a == b or b == c or a == c 


def scalene(sides):
    
    if len(sides) != 3 or any(side <= 0 for side in sides):
        return False
    
    a, b, c = sides
    if a + b <= c or a + c <= b or b + c <= a:
        return False
    
    return a != b and b != c and a != c
