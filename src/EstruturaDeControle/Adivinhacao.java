package EstruturaDeControle;

import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
  public static void main(String[] args) {
    Random gerador = new Random();
    Scanner scanner = new Scanner(System.in);

    int tentativas = 0;
    int numeroAle = gerador.nextInt(101);
    boolean achou = false;

    do {
      System.out.println("Digite um numero: ");
      int n = scanner.nextInt();
      if (n == numeroAle) {
        System.out.println("Achou!");
        achou = true;
        break;
      } else if (n < numeroAle) {
        System.out.println("o numero é maior");
      } else {
        System.out.println("O numero é menor");
      }

      System.out.println("Tentativa: " + (tentativas + 1));
      tentativas++;
    } while (tentativas < 10);

    if (!achou) {
      System.out.println("Que pena tente novamente...");
    }

    scanner.close();
  }
}
