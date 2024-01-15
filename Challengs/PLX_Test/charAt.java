public class charAt {

    public static void main(String[] args) {
        String str = "Hello World";

        char ch = str.charAt(4); // Acessando o caractere na posição 4 (índice 4)
        System.out.println("Caractere na posição 4: " + ch); // Imprime o caractere

        int length = str.length();
        System.out.println(length);

        char ch2 = str.charAt(str.length()); // Tentativa de acessar fora dos limites da string
        System.out.println("Caractere fora dos limites: " + ch2); // Nunca será alcançado

    }
}
