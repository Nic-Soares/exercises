def label(colors):
    color-coded = {"black": 0, "brown": 1, "red": 2, "orange": 3, "yellow": 4, "green": 5, "blue": 6, "violet": 7, "grey": 8, "white": 9}

    x, y, z = colors[0], colors[1], colors[2]
    
    if color_coded.get(z) < 3:
        unit = " ohms"
    elif color_coded.get(z) >= 3 and color_coded.get(z) < 6:
        unit = " kiloohms"
    else:
        unit = " megaohms"

    value = int(str(color_coded.get(x)) + str(color_coded.get(y)))

label(["orange", "orange", "black"])
