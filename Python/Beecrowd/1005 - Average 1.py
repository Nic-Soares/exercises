#Leia 2 valores de ponto flutuante de dupla precisão A e B,
#que correspondem a 2 notas de um aluno. A seguir, calcule a média do aluno,
#sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5
#(A soma dos pesos portanto é 11). Assuma que cada nota pode ir de
#0 até 10.0, sempre com uma casa decimal.

#Entrada
#O arquivo de entrada contém 2 valores com uma casa decimal cada um.

#Saída
#Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo,
#com 5 dígitos após o ponto decimal e com um espaço em branco antes e
#depois da igualdade. Utilize variáveis de dupla precisão (double)
#e como todos os problemas, não esqueça de imprimir o fim de linha
#após o resultado, caso contrário, você receberá "Presentation Error".

A = float(input())
B = float(input())
MEDIA = (A * 3.5 + B * 7.5) / 11
print('MEDIA = {:.5f}'.format(MEDIA))

#SUBMISSÃO # 26248548
#PROBLEMA: 1005 - Média 1
#RESPOSTA: Accepted
#LINGUAGEM: Python 3.9 (Python 3.9.4) [+1s] {beta}
#TEMPO: 0.107s
#TAMANHO: 111 Bytes
#MEMÓRIA: -
#SUBMISSÃO: 12/02/2022 13:00:28