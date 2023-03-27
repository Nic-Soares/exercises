import java.util.Scanner; // Importa a classe Scanner para ler dados do teclado
import java.util.Stack; // Importa a classe Stack para implementar a pilha
public class HexadecimalConverter {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); //  Cria um objeto Scanner para ler dados do teclado

    System.out.println("Digite um número inteiro diferente de zero: ");
    int num = sc.nextInt(); // Lê um número inteito no teclado

    if (num == 0) { // Verifica se o número é válido
      System.out.println("Número inválido");
      return; // Encerra a execução do programa
    }

    Stack<Integer> pilha = new Stack<>(); // Cria uma pilha vazia para armazenar os restos da divisões

    while (num != 0) { // Enquanto o número nao for zero
      int resto = num % 16; // Calcula o resto da divisao por 16
      pilha.push(resto); // Armazena o resto na pilha
      num /= 16; // Divide o número por 16
    }

    System.out.print("O número em hexadecima é: ");

    while (!pilha.empty()) { // Enquanto a pilha não estiver vazia
      int resto = pilha.pop(); // Desempilha o último valor da pilha (o último resto)
      if (resto < 10) { // Se o resto for um número menor que 10
        System.out.print(resto); // Imprime o resto;
      } else {
        char letra = (char) ('A' + resto - 10); // Converte o resto para um letra hexadecimal
        System.out.print(letra);
      }
    }

    System.out.println(); // Imprime uma nova linha

  }

}
