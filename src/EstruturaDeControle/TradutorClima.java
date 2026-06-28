package EstruturaDeControle;

import java.util.Scanner;

public class TradutorClima {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite uma estação do ano: ");
    String estacao = sc.nextLine().toLowerCase();
    switch (estacao) {
      case "verao", "verão":
        System.out.print("Use roupas leves e hidrate-se");
        break;

      case "primavera":
        System.out.print("Faça piquinique e saia de casa");
        break;

      case "inverno":
        System.out.print("Maratonar séries e filmes debaixo das cobertas");
        break;

      case "outono":
        System.out.print("Explorar a natureza, cozinhar pratos aconchegantes");
        break;

      default:
        System.out.println("Erro nenhuma estação válida!");
    }
    sc.close();
  }
}
