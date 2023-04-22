package Questao0111;
public class Data {
    int dia, mes, ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public boolean bissexto(){
        if(ano % 4 == 0){
            return true;
        }

        else{
            return false;
        }
    }

    public static void main(String[] args){

        Data d1 = new Data(1, 6, 2020);

        String print = String.valueOf(d1.bissexto());

        System.out.println(print);

    }
}
