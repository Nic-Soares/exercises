package projdicionario;

import java.util.*;

public class ProjDicionario {

    public static void main(String[] args) {
        Dicionario ingles = new Dicionario(10);
        Scanner ent = new Scanner(System.in);
        int opc = 0;
        while (opc != 5) {
            System.out.println("MENU");
            System.out.println("1- Inserir Definição");
            System.out.println("2- Excluir Definição");
            System.out.println("3- Consultar Definição");
            System.out.println("4- Quantidade de Definições");
            System.out.println("5- Encerrar");
            do {
                opc = ent.nextInt();
            } while (opc < 1 || opc > 5);

            String palavra, traducao;

            if (opc == 1) {
                System.out.println("Informe a palavra em Inglês: ");
                palavra = ent.next();
                palavra = palavra.toUpperCase();
                System.out.println("Informe a tradução de " + palavra + " : ");
                traducao = ent.next();
                traducao = traducao.toUpperCase();
                ingles.insere(new Definicao(palavra, traducao));
            }
            if (opc == 2) {
                System.out.println("Informe a palavra que será removida: ");
                palavra = ent.next();
                palavra = palavra.toUpperCase();
                ingles.remove(palavra);
            }
            if (opc == 3) {
                System.out.println("Informe a palavra para consulta: ");
                palavra = ent.next();
                palavra = palavra.toUpperCase();
                Definicao aux = ingles.consulta(palavra);
                if (aux != null)
                    System.out.println("Tradução de " + aux.getPalavra() + " = " + aux.getTraducao());
                else
                    System.out.println("Essa definição NÃO está cadastrada!!\n\n");
            }
            if (opc == 4) {
                System.out.println("Quantidade de palavras cadastradas: " + ingles.size() + "\n\n");
            }

        }

    }
}
