package EstruturaDeControle;

import java.util.Scanner;

public class AnoBissexto {
  static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe o ano: ");
    int ano = sc.nextInt();
    if (ano % 4 == 0 && ((ano % 100) != 0 || ano % 400 == 0)) {
      System.out.printf("O ano %d é bissexto", ano);
    } else {
      System.out.printf("O ano %d não é bissexto", ano);
    }
    sc.close();
  }
}
