package projdicionario;

import java.util.ArrayList;
import java.util.LinkedList;

public class Dicionario {

    private ArrayList<LinkedList<Definicao>> conjunto;
    int tamanho;

    public Dicionario(int c) {
        // constroi o Arraylist e dentro dele, 
        // instância uma lista ligada em cada posição
        conjunto = new ArrayList<LinkedList<Definicao>>(c);
        for (int i = 0; i < c; i++) {
            conjunto.add(new LinkedList<Definicao>());
        }
        tamanho = 0;
    }
    
    public int size(){
        return tamanho;
    }

    public void insere(Definicao def) {
        //adiciona uma palavra no dicionário
        //envia palavra para a função que define a posição
        int pos = hashFunc(def.getPalavra());
        //adiciona a definição na lista ligada dentro da posição correspondente
        conjunto.get(pos).add(def);
        //atualiza contador
        tamanho++;
        System.out.println("Definição cadastrada com sucesso!!\n\n");
    }

    public void remove(String palavra) {
        //retira uma palavra do dicionario
        //descobre em qual posição (lista ligada a palavra está)
        int pos = hashFunc(palavra);
        //armazena a lista ligada da posição correspondete em uma lista separada
        LinkedList<Definicao> lista = conjunto.get(pos);
        //inicia a busca pela palavra... ela pode não existir
        int flag = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getPalavra().equals(palavra)) {
                Definicao aux = lista.get(i);
                lista.remove(aux);
                flag = 1;
                tamanho--;
                System.out.println("Definição removida com sucesso!!\n\n");
            }
        }
        if (flag == 0) {
            System.out.println("Essa definição NÃO está cadastrada!!\n\n");
        }
    }

    public Definicao consulta(String palavra) {
        //procura uma palavra no dicionario
        //descobre em qual posição (lista ligada a palavra está)
        int pos = hashFunc(palavra);
        //armazena a lista ligada da posição correspondete em uma lista separada
        LinkedList<Definicao> lista = conjunto.get(pos);
        //inicia a busca pela palavra... ela pode não existir
        int flag = 0;
        Definicao aux = null;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getPalavra().equals(palavra)) {
                aux = lista.get(i);
                flag = 1;
            }
        }
        return aux;
    }

    public int hashFunc(String palavra) {
        //pega a primeira letra da palavra
        char l1 = palavra.charAt(0);
        //pega a última letra da palavra
        char l2 = palavra.charAt(palavra.length() - 1);
        //soma os valores ASCII de cada uma das letras
        int soma = (int) l1 + (int) l2;
        //aplica função mod 10
        int resto = soma % 10;
        return resto;
    }
}
