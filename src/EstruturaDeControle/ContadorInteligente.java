package EstruturaDeControle;

import java.util.Scanner;

public class ContadorInteligente {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int contagem = 10;

    while (contagem > 0) {
      System.out.println(contagem);

      System.out.print("Deseja abortar a missão? (S/N): ");
      String res = scanner.nextLine();

      if (res.equalsIgnoreCase("S")) {
        System.out.println("Missão Abortada!");
        break;
      }
      contagem--;
    }

    if (contagem == 0) {
      System.out.println("Fogo! 🚀");
    }

    scanner.close();
  }
}
