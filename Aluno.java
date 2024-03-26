public class Aluno {
  public String nome;
  public double[] nota = new double[3];

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double[] getNota() {
    return nota;
  }

  public void setNota(double[] nota) {
    this.nota = nota;
  }

  public double resulMedia() {
    double soma = 0;
    for (double n : nota) {
      soma += n;
    }
    return soma / nota.length;
  }
}
