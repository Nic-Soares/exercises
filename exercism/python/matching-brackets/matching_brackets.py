def is_paired(input_string):
    # Mapeamento dos pares de fechamento e abertura
    brackets = {'(': ')', '[': ']', '{': '}'}
    stack = []
    
    # Ignorar caracteres que não sejam parênteses, colchetes ou chaves
    for char in input_string:
        if char in brackets:  # Se for um símbolo de abertura
            stack.append(char)
        elif char in brackets.values():  # Se for um símbolo de fechamento
            # Verificar se a pilha está vazia ou o topo não corresponde ao fechamento esperado
            if not stack or brackets[stack.pop()] != char:
                return False
    
    # Se a pilha estiver vazia, todos os parênteses, colchetes e chaves estão balanceados
    return len(stack) == 0
