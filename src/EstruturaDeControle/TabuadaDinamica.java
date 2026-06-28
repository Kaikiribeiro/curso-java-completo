package EstruturaDeControle;

import java.util.Scanner;

public class TabuadaDinamica {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um numero inteiro: ");
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= 10; j++) {
        System.out.printf("%d x %d = %d\n", i, j, (i * j));
      }
      System.out.println("---------------");
    }
    sc.close();
  }
}
