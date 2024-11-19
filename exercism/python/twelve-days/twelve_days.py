ordinals = (
    'first', 'second', 'third', 'fourth', 'fifth', 'sixth', 
    'seventh', 'eighth', 'ninth', 'tenth', 'eleventh', 'twelfth'
)

gifts = (
    'a Partridge in a Pear Tree', 
    'two Turtle Doves',
    'three French Hens',
    'four Calling Birds',
    'five Gold Rings',
    'six Geese-a-Laying',
    'seven Swans-a-Swimming',
    'eight Maids-a-Milking',
    'nine Ladies Dancing',
    'ten Lords-a-Leaping',
    'eleven Pipers Piping',
    'twelve Drummers Drumming',
)

def recite(start_verse, end_verse):
    result = []
    for day in range(start_verse, end_verse + 1):
        # Verso inicial
        verse = [f"On the {ordinals[day - 1]} day of Christmas my true love gave to me: "]

        # Adicionar presentes acumulados
        for i in reversed(range(day)):
            if i == 0 and day > 1:  # "and" no último presente (exceto no primeiro dia)
                verse.append(f"and {gifts[i]}.")
            elif i == 0:  # Apenas o ponto final no primeiro presente do primeiro dia
                verse.append(f"{gifts[i]}.")
            else:
                verse.append(f"{gifts[i]}, ")

        # Concatenar tudo em uma única string
        result.append("".join(verse))
    
    return result


result = recite(8, 8)
print(result)
