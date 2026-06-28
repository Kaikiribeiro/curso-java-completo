package EstruturaDeControle;

import java.util.Scanner;

public class NumeroPrimo {
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

    if (contador == 0) {
      System.out.println("É Primo!");
    } else {
      System.out.println("Não é Primo!");
    }
    scanner.close();
  }
}
