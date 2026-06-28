package EstruturaDeControle;

import java.util.Scanner;

public class SomaAte {
  static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um numero positivo pra soma ou negativo pra sair: ");
    int n = scanner.nextInt();
    int soma = 0;

    while (n >= 0) {
      soma += n;
      System.out.println("Soma de todos os positivos ate o momento: " + soma);
      System.out.println("Digite um numero positivo pra soma ou negativo pra sair: ");
      n = scanner.nextInt();
    }

    System.out.println("Soma de todos os positivos final: " + soma);

    scanner.close();
  }
}
