package Questao0011;
public class Aluno {

    String nome;
    double notaFinal;
    String disciplina;

    public Aluno(String nome, double notaFinal, String disciplina) {
        this.nome = nome;
        this.notaFinal = notaFinal;
        this.disciplina = disciplina;
    }


    public void mostraAluno() {
        System.out.println(nome + " " + notaFinal + " " + disciplina);

    }

    public void mostraSituacao() {


        if (notaFinal >= 7.5) {
            System.out.println("Aprovado");
        } else if (notaFinal <= 2) {
            System.out.println("Reprovado");
        } else if (notaFinal > 2 && notaFinal < 7.5) {
            System.out.println("Exame");
        }
    }
}
