package Done;

public class Banca {
  private Professor[] professores;

  public Banca(Professor professor1, Professor professor2) {
    this.professores = new Professor[2];
    this.professores[0] = professor1;
    this.professores[1] = professor2;
  }

  public Banca(Professor professor1, Professor professor2, Professor professor3, Professor professor4) {
    this.professores = new Professor[4];
    this.professores[0] = professor1;
    this.professores[1] = professor2;
    this.professores[2] = professor3;
    this.professores[3] = professor4;
  }

  public Professor[] getProfessores() {
    return professores;
  }

  public String getNomesProfessores() {
    String nomes = "";
    for (Professor professor : professores) {
      nomes += professor.getNome() + " - ";
    }
    return nomes.substring(0, nomes.length() - 2);
  }


  public String getInfoBanca() {
    if (professores.length == 2) {
      return "Banca: " + getNomesProfessores();
    } else if (professores.length == 4) {
      return "Banca: " + getNomesProfessores();
    } else {
      return "Banca inválida";
    }
  }

}
