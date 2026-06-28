package EstruturaDeControle;

import java.util.Scanner;

public class SomarAteDoWhile {
  static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int somaTotal = 0;
    int n = 0;
    do {
      System.out.print("Digite um numero positivo pra somar (DIGITE 0 PRA SAIR):");
      n = scanner.nextInt();
      somaTotal += n;
    } while (n != 0);
    System.out.println("Soma Total dos numeros: " + somaTotal);
    scanner.close();
  }
}
