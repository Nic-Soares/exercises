'''
Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, de modo que o lado A representa o maior dos 3 lados. A seguir, determine o tipo de triângulo que estes três lados formam, com base nos seguintes casos, sempre escrevendo uma mensagem adequada:

    se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
    se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
    se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
    se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
    se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
    se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES

Entrada

A entrada contem três valores de ponto flutuante de dupla precisão A (0 < A) , B (0 < B) e C (0 < C).
Saída

Imprima todas as classificações do triângulo especificado na entrada.
'''

# p1 = input().split()
# x1, x2, x3 = p1

x1,x2,x3 = map(float,input().split())

if(x1 < x2):
    temp = x1
    x1 = x2
    x2 = temp

if(x2 < x3):
    temp = x2
    x2 = x3
    x3 = temp

if(x1 < x2):
    temp = x1
    x1 = x2
    x2 = temp

if(x1 >= (x2 + x3)):
    print("NAO FORMA TRIANGULO")

elif(x1 * x1 == (x2 * x2 + x3 * x3)):
     print("TRIANGULO RETANGULO")

elif(x1 * x1 > (x2 * x2 + x3 * x3)):
    print("TRIANGULO OBTUSANGULO")

elif(x1 * x1 < (x2* x2 + x3 * x3)):
    print("TRIANGULO ACUTANGULO")

if(x1 == x2 and x2 == x3):
    print("TRIANGULO EQUILATERO")
        
elif(x1 == x2 or x2 == x3):
    print("TRIANGULO ISOSCELES")





print(x1, x2, x3)
