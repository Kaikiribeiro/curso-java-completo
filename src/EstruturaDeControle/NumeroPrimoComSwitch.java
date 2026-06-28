package EstruturaDeControle;

import java.util.Scanner;

public class NumeroPrimoComSwitch {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite um numero: ");
    int n = scanner.nextInt();
    int contador = 0;

    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        contador++;
      }
    }

    switch (contador) {
      case 0:
        System.out.println("O numero " + n + " é um numero primo.");
        break;

      default:
        System.out.println("O numero " + n + "  não é um numero primo.");
    }
    scanner.close();
  }
}
