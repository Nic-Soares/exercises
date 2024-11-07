def label(colors):
    color_coded = {
        "black": 0, "brown": 1, "red": 2, "orange": 3, "yellow": 4,
        "green": 5, "blue": 6, "violet": 7, "grey": 8, "white": 9
    }

    x, y, z = colors[0], colors[1], colors[2]
    
    # Calculando o valor da resistência
    value = int(str(color_coded.get(x)) + str(color_coded.get(y))) * (10 ** color_coded.get(z))

    # Atribuindo unidade de forma garantida
    if value < 1000:
        unit = " ohms"
    elif value >= 1000 and value < 1000000:
        value = value // 1000
        unit = " kiloohms"
    elif value >= 1000000 and value < 1000000000:
        value = value // 1000000
        unit = " megaohms"
    else:
        value = value // 1000000000
        unit = " gigaohms"

    return f"{value}{unit}"
