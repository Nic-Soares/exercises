import java.util.Scanner;

public class StringCompression {

    // Método para compactar uma string
    public static String compressString(String input) {
       
        String compressed = ""; // String para armazenar a string compactada
        int countConsecutive = 1; // Contador para contar sequências consecutivas de caracteres iguais

        // Loop pela string de entrada
        for (int i = 0; i < input.length() - 1; i++) { // "input.length() - 1" Limita que o "for" percorra apenas até a penultima caracter, para evitar erro caso tente comparar a ultima caracter sem necessidade
            if (input.charAt(i) == input.charAt(i + 1)) {
                countConsecutive++; // Se o caractere atual for igual ao próximo, incrementa o contador
            } else {
                // Se o caractere atual for diferente do próximo, adiciona o caractere e a contagem à string compactada
                compressed += input.charAt(i) + "" + countConsecutive;
                countConsecutive = 1; // Reseta o contador para 1
            }
        }

        // Adiciona o último caractere e a contagem à string compactada
        compressed += input.charAt(input.length() - 1) + "" + countConsecutive;

        return compressed; // Retorna a string compactada
    }

    public static boolean isInvalidString(String input) {
        // Remove espaços em branco no início e no fim da string
        String trimmedInput = input.trim();

        // Verifica se a string contém apenas espaços em branco ou é vazia
        if (trimmedInput.isEmpty()) {
            return true;
        }

        if (!trimmedInput.matches("^[a-zA-Z ]+$")) {
            return true; // Retorna true se encontrar um caractere inválido
        }

        return false; // Retorna false se a string for válida
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        if (isInvalidString(input)) {
            System.out.println("\nDigite alguma caracter valida de a-z/A-Z");
        } else {
            System.out.println("\nString compactada: " + compressString(input));
        }

        scanner.close();
    }
    
}
