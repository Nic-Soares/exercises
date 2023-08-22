import java.util.Scanner;
public class Praticando01 {
    public static void main(String[] args) {
        double n1, n2;
        int op;
        Scanner entrada = new Scanner(System.in);
        while (true){
            System.out.println("1-Soma\n2-Subtraçao\n3-Multiplicaçao\n4-Divisao\n5-Sair");
            op = entrada.nextInt();
            if (op==5)
                break;
            if (op<1 || op>6) {
                System.out.println("Opçao invalida");
                continue;
            }
            System.out.println("Digite 2 números: ");
            n1 = entrada.nextDouble();
            n2 = entrada.nextDouble();
            if (op==4 && n2==0){
                System.out.println("NÃO FOI POSSÍVEL REALIZAR A OPERAÇÃO");
                continue;
            }
            switch (op) {
                case 1 : System.out.println("Soma = " + (n1+n2));
                    break;
                case 2 : System.out.println("Subtração = " + (n1-n2));
                    break;
                case 3 : System.out.println("Multiplicação = " + (n1*n2));
                    break;
                case 4 : System.out.println("Divisão = " + (n1/n2));
                    break;
            }
        }
    }

}

