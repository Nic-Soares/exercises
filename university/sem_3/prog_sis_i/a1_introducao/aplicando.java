import java.util.Scanner;
public class Aplicando01 {
    public static void main(String[] args) throws Exception {
        double n1, n2, media;
        int op;
        Scanner entrada = new Scanner(System.in);
        while (true){
            System.out.println("1-Média\n2-Diferença\n3-Multiplicaçao\n4-Divisao\n5-Sair");
            op = entrada.nextInt();
            if (op==5)
                break;
            if (op<1 || op>6) {
                System.out.println("OPÇÃO INVÁLIDA");
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
                case 1 : System.out.println(((n1 + n2)/2));
                    break;
                case 2 : 
                    if (n1 > n2){
                      System.out.println((n1-n2));
                    }
                    else {
                      System.out.println((n2-n1));
                    }
                    break;
                case 3 : System.out.println((n1*n2));
                    break;
                case 4 : 
                    if (n2 <= 0){
                      System.out.println("NÃO FOI POSSÍVEL REALIZAR A OPERAÇÃO");
                    break;           
                    }
                    else {
                      System.out.println((n1/n2));
                    break;
                    }
                    default:
                      System.out.println("OPÇÃO INVÁLIDA");
            }
        }
    }

}