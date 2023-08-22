package projaeroporto;

public class Destinos {

    Aeroporto[] tabela = new Aeroporto[10];
    char[] flag = new char[10];
    int qtde;

    Destinos() {
        for (int i = 0; i < tabela.length; i++) {
            flag[i] = 'L';
        }
        qtde = 0;
    }

    int funcaoHash(String cod) {
        int soma = 0;
        for (int i = 0; i < cod.length(); i++) {
            soma += (int) cod.charAt(i);
        }
        return soma % tabela.length;
    }

    void mostrarTH() {
        for (int i = 0; i < tabela.length; i++) {
            if (flag[i] == 'O') {
                System.out.print("\nEntrada " + i + ": " + tabela[i].getCodigo() + " - " + tabela[i].getCidade());
            }
        }
    }

    void inserirTH(int pos, Aeroporto n) {
        if (flag[pos] == 'L' || flag[pos] == 'R') {
            tabela[pos] = n;
            flag[pos] = 'O';

        } else {
            int i = pos + 1;
            if (i == tabela.length) {
                i = 0;
            }
            while (true) {
                if (flag[i] != 'O') {
                    tabela[i] = n;
                    flag[i] = 'O';
                    break;
                } else {
                    i++;
                    if (i == tabela.length) {
                        pos = 0;
                    }
                }
            }
            
        }
        System.out.println("\nAeroporto inserido com sucesso!");
        qtde++;

    }

    int buscarTH(String n) {
        int i = 0;
        int pos = funcaoHash(n);
        
        if (tabela[pos].getCodigo().equals(n)){
            return pos;
        }
        else {
            i = pos + 1;
            if (i==tabela.length)
                    i = 0;
            while (true){
                if (flag[i] != 'O' || i==pos){
                    pos = tabela.length;
                    break;
                }
                if (tabela[i].getCodigo().equals(n)){
                    pos = i;
                    break;
                }
                i++;
                if (i==tabela.length)
                    i = 0;           
            }
            return pos;
        }      
    }

    void remover(String n) {
        int posicao = buscarTH(n);

        if (posicao < tabela.length) {
            flag[posicao] = 'R';
            System.out.println("\nAeroporto EXCLUÍDO com sucesso!");
            qtde--;
        } else {
            System.out.println("\nAeroporto não está presente!!");
        }
    }
}
