import java.util.Scanner;

public class Exercicio21 {
  public static void executar() {
    Scanner leitor = new Scanner(System.in);
    Nadador nadador = new Nadador();

    System.out.println("Digite a idade do nadador: ");
    nadador.idade = leitor.nextInt();

    nadador.classi();

    leitor.close();
  }
}
