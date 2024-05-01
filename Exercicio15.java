import java.util.Scanner;

public class Exercicio15 {
  public static void executar() {
    Scanner leitor = new Scanner(System.in);

    Veiculo veiculo = new Veiculo();

    System.out.println("Insira o nome do veículo:");
    veiculo.nomeVeiculo = leitor.nextLine();

    System.out.println("Insira o combustivel do veículo (alcool, gasolina e diesel):");
    veiculo.combustivel = leitor.nextLine();

    System.out.println("Insira o valor do veículo: ");
    veiculo.valorVeiculo = leitor.nextDouble();

    veiculo.somaValor();

    leitor.close();
  }
}
