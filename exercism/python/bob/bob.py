def response(hey_bob):
    # Remover espaços no início e no final da string
    trimmed = hey_bob.strip()

    # Verifica se a entrada está vazio
    if not trimmed:
        return "Fine. Be that way!"

    # Verifica se é uma pergunta gritada
    if trimmed.isupper() and trimmed.endswith('?'):
        return "Calm down, I know what I'm doing!"

    # Verificar se é uma pergunta
    if trimmed.endswith('?'):
        return "Sure."

    # Verificar se está gritando
    if trimmed.isupper():
        return "Whoa, chill out!"

    # Qualquer outra coisa
    return "Whatever."
