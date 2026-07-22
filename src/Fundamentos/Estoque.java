import java.util.Scanner;

public class Estoque {
  static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Quantidade de Produtos: ");
    int produtos = sc.nextInt();
    System.out.println("Valor da Compra: ");
    double valorCompra = sc.nextDouble();
    boolean clientePremio = true;

    boolean precisaRepor = produtos < 10;
    System.out.printf("Precisa Repor: %b\n", precisaRepor);

    boolean ganharFreteGratis = valorCompra > 500 && clientePremio;
    System.out.println("Ganhou o frete: " + ganharFreteGratis);
    sc.close();
  }
}
