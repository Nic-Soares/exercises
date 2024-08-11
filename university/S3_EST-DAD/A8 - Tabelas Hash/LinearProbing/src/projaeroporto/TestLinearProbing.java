package projaeroporto;

import java.util.*;

public class TestLinearProbing {

    public static void main(String[] args) {
        int op, pos;

        Scanner ent = new Scanner(System.in);

        Destinos dest = new Destinos();

        String codigo;
        String cidade;

        do {
            System.out.println("\nMenu de opções\n");
            System.out.println("1- Inserir elemento");
            System.out.println("2- Mostrar Tabela Hash");
            System.out.println("3- Excluir elemento");
            System.out.println("4- Consultar elemento");
            System.out.println("5- Sair");
            System.out.println("\nDigite a sua opção: ");
            op = ent.nextInt();

            if (op < 1 || op > 5) {
                System.out.println("\nOpção inválida!");
            } else {
                switch (op) {
                    case 1:
                        if (dest.qtde == dest.tabela.length) {
                            System.out.println("Tabela Cheia!!");
                        } else {
                            System.out.print("\nDigite um Código de Aeroporto: ");
                            codigo = ent.next();
                            ent.nextLine();
                            codigo = codigo.toUpperCase();
                            System.out.print("Digite a cidade desse Aeroporto: ");
                            cidade = ent.nextLine();
                            //calcula a posição na TH
                            pos = dest.funcaoHash(codigo);
                            dest.inserirTH(pos, new Aeroporto(codigo, cidade));
                        }
                        break;

                    case 2:
                        dest.mostrarTH();
                        break;
                    case 3:
                        System.out.print("\nDigite o Código do Aeroporto para exclusão: ");
                        codigo = ent.next();
                        codigo = codigo.toUpperCase();
                        dest.remover(codigo);
                        break;
                    case 4:
                        System.out.print("\nDigite o Código de Aeroporto para pesquisa: ");
                        codigo = ent.next();
                        codigo = codigo.toUpperCase();
                        pos = dest.buscarTH(codigo);
                        if (pos == dest.tabela.length) {
                            System.out.println("\nAeroporto NÃO existe na tabela!");
                        } else {
                            System.out.println("\nAeroporto EXISTE na tabela na posição " + pos);
                        }
                }
            }
        } while (op != 5);
    }

}
