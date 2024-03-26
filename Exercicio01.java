import java.util.Scanner;

public class Exercicio01 {
  public static void executar() {
    Scanner leitor = new Scanner(System.in);

    System.out.println("Insira o nome do aluno: ");
    String nome = leitor.nextLine();

    Aluno aluno = new Aluno();

    aluno.setNome(nome);

    double[] notas = new double[3];

    for (int cont = 0; cont < 3; cont++) {
      System.out.println("Insira a nota " + (cont + 1) + ": ");
      notas[cont] = leitor.nextDouble();
    }

    aluno.setNota(notas);

    System.out.println("\nNome do aluno: " + aluno.getNome() + "\nMédia: " + aluno.resulMedia());

    leitor.close();
  }
}