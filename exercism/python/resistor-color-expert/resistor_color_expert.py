color_coded = {
    "black": 0, "brown": 1, "red": 2, "orange": 3, "yellow": 4,
    "green": 5, "blue": 6, "violet": 7, "grey": 8, "white": 9,
}

tolerance_colors = {
    "grey": 0.05, "violet": 0.1, "blue": 0.25, "green": 0.5,
    "brown": 1, "red": 2, "gold": 5, "silver": 10
}

def resistor_label(colors):
    if len(colors) == 1:  # Caso especial para resistores de uma banda
        return "0 ohms"

    if len(colors) < 4:
        raise ValueError("A lista de cores deve conter pelo menos 4 valores.")
        
    # Obter os valores das cores
    value_1 = color_coded.get(colors[0])
    value_2 = color_coded.get(colors[1])

    if len(colors) == 4:  # Resistor de 4 bandas
        multiplier = color_coded.get(colors[2])
        tolerance = tolerance_colors.get(colors[3])
    elif len(colors) == 5:  # Resistor de 5 bandas
        value_3 = color_coded.get(colors[2])
        multiplier = color_coded.get(colors[3])
        tolerance = tolerance_colors.get(colors[4])
    else:
        raise ValueError("A lista de cores deve conter no máximo 5 valores.")

    # Verificar se alguma cor é inválida
    if None in [value_1, value_2, multiplier, tolerance] or (len(colors) == 5 and value_3 is None):
        raise ValueError("Uma das cores fornecidas não é válida.")

    # Calcular a resistência
    if len(colors) == 4:
        ohms = (value_1 * 10 + value_2) * (10 ** multiplier)
    else:
        ohms = (value_1 * 100 + value_2 * 10 + value_3) * (10 ** multiplier)

    if ohms >= 1_000_000:
        return f"{int(ohms / 1_000_000) if ohms % 1_000_000 == 0 else ohms / 1_000_000} megaohms ±{tolerance}%"
    elif ohms >= 1_000:
        return f"{int(ohms / 1_000) if ohms % 1_000 == 0 else ohms / 1_000} kiloohms ±{tolerance}%"
    else:
        return f"{ohms} ohms ±{tolerance}%"
