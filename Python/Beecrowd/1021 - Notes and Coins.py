'''
Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal.
'''

N = float(input())

if N >= 0 and N <= 1000000.00:
    print("NOTAS:")
    print(f"{int(N//100)} nota(s) de R$ 100.00")
    N %= 100
    print(f"{int(N//50)} nota(s) de R$ 50.00")
    N %= 50
    print(f"{int(N//20)} nota(s) de R$ 20.00")
    N %= 20
    print(f"{int(N//10)} nota(s) de R$ 10.00")
    N %= 10
    print(f"{int(N//5)} nota(s) de R$ 5.00")
    N %= 5
    print(f"{int(N//2)} nota(s) de R$ 2.00")
    N %= 2
    print("MOEDAS:")
    print(f"{int(N//1)} moeda(s) de R$ 1.00")
    N %= 1
    print(f"{int(N//0.50)} moeda(s) de R$ 0.50")
    N %= 0.50
    print(f"{int(N//0.25)} moeda(s) de R$ 0.25")
    N %= 0.25
    print(f"{int(N//0.10)} moeda(s) de R$ 0.10")
    N %= 0.10
    print(f"{int(N//0.05)} moeda(s) de R$ 0.05")
    N %= 0.05
    print(f"{int(N//0.01)} moeda(s) de R$ 0.01")
    N %= 0.01

# A=float(input())
# N=A
# a=N/100
# b=N%100
# c=b/50
# d=b%50
# e=d/20
# f=d%20
# g=f/10
# h=f%10
# i=h/5
# j=h%5
# k=j/2
# l=j%2

# E=A*100
# B=(int(E))
# m=B%100
# n=m/50
# o=m%50
# p=o/25
# q=o%25
# r=q/10
# s=q%10
# t=s/5
# u=s%5
# print("NOTAS:")
# print(f"{int(a)} nota(s) de R$ 100.00")
# print(f"{int(c)} nota(s) de R$ 50.00")
# print(f"{int(e)} nota(s) de R$ 20.00")
# print(f"{int(g)} nota(s) de R$ 10.00")
# print(f"{int(i)} nota(s) de R$ 5.00")
# print(f"{int(k)} nota(s) de R$ 2.00")
# print(f"MOEDAS:")
# print(f"{int(l)} moeda(s) de R$ 1.00")
# print(f"{int(n)} moeda(s) de R$ 0.50")
# print(f"{int(p)} moeda(s) de R$ 0.25")
# print(f"{int(r)} moeda(s) de R$ 0.10")
# print(f"{int(t)} moeda(s) de R$ 0.05")
# print(f"{int(u)} moeda(s) de R$ 0.01")