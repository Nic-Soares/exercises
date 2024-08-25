package Questao0011;

import java.util.Scanner;
public class TestaAluno {
    public static void main(String[] args) {
        String nome;
        double notaFinal;
        String disciplina;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o nome do aluno: ");

        nome = entrada.next();

        System.out.println("Entre com a nota final: ");
        notaFinal = entrada.nextDouble();

        System.out.println("Entre com o nome da disciplina");

        disciplina = entrada.next();

        Aluno aluno = new Aluno(nome, notaFinal, disciplina);

        aluno.mostraAluno();
        aluno.mostraSituacao();


    }
}
