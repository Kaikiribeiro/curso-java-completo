package EstruturaDeControle;

import java.util.Scanner;

public class UniverdadeAprovacao {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite a N1: ");
    float n1 = sc.nextFloat();
    System.out.print("Digite a N2: ");
    float n2 = sc.nextFloat();

    if ((n1 < 0 || n2 < 0) || (n1 > 10 || n2 > 10)) {
      System.out.print("Nota Invalida!");
    } else {

      float media = (n1 + n2) / 2;

      if (media >= 9.0) {
        System.out.println("Quadro de Honra!");
      } else if (media >= 7.0) {
        System.out.println("Aprovado");
      } else if (media >= 5.0) {
        System.out.println("Recuperação");
      } else {
        System.out.println("Reprovado");
      }
    }
    sc.close();
  }
}
