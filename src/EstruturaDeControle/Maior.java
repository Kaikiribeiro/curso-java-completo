package EstruturaDeControle;

import java.util.Scanner;

public class Maior {
  static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o 1°: ");
    int n = scanner.nextInt();

    int maior = n;

    for (int i = 1; i < 10; i++) {
      System.out.printf("Digite o %d°: ", i + 1);
      n = scanner.nextInt();
      if (n > maior) {
        maior = n;
      }
    }

    System.out.println("MAIOR: " + maior);

    scanner.close();
  }
}
