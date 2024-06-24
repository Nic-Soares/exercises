'''
Given a string, remove any characters that are unique from the string.

Example:

input: "abccdefee"

output: "cceee"

link: https://www.codewars.com/kata/5a1dc4baffe75f270200006b
'''

def only_duplicates(string):
    # Cria um dicionário para contar a frequência de cada caractere
    contagem_caracteres = {}
    
    # Conta a frequência de cada caractere na string
    for caractere in string:
        if caractere in contagem_caracteres:
            contagem_caracteres[caractere] += 1
            print("if")
            print(caractere, "\n", contagem_caracteres )
        else:
            contagem_caracteres[caractere] = 1
            print("else")
            print(caractere, "\n", contagem_caracteres )
    
    # Constroi a string de saída com caracteres que aparecem mais de uma vez
    resultado = ''.join([caractere for caractere in string if contagem_caracteres[caractere] > 1])
    
    return resultado

string_entrada = "abccdefee"
string_saida = only_duplicates(string_entrada)
print(string_saida)  

