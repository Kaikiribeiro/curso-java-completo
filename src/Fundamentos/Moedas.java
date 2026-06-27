import java.util.Scanner;

public class Moedas {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.printf("Digite o valor da compra: ");
    String entrada = sc.nextLine();
    double valor = Double.parseDouble(entrada);
    int valorInteiro = (int) valor;
    System.out.printf("Valor Inteiro: " + valorInteiro);
    sc.close();
  }
}
