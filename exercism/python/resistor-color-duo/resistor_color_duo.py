color_coded = {
    "black": 0, "brown": 1, "red": 2, "orange": 3, "yellow": 4,
    "green": 5, "blue": 6, "violet": 7, "grey": 8, "white": 9,
}


def value(colors):
    x, y = colors[0], colors[1]
    return int(str(color_coded.get(x)) + str(color_coded.get(y)))