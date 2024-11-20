def transform(legacy_data):
    new_data = {}
    for key, value in legacy_data.items():
        print(key, value)  # Imprime cada par chave-valor
        for letter in value:
            new_data[letter.lower()] = key

    sorted_dict = {key: new_data[key] for key in sorted(new_data)}
    return new_data

