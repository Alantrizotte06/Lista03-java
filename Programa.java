import java.util.Scanner;

public class Programa {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    System.out.println("Qual exercicio deseja executar ?");
    int ex = leitor.nextInt();

    switch (ex) {
      case 1:
        Exercicio01.executar();
        break;
      default:
        System.out.println("Número de exercicio inválido");
        break;
    }
    leitor.close();
  }
}
