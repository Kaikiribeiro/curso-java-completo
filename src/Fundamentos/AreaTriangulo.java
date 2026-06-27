import java.util.Scanner;

public class AreaTriangulo {
  static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a base de um Triangulo qualquer: ");
    int base = scanner.nextInt();
    System.out.println("Digite a altura desse mesmo Triangulo: ");
    int h = scanner.nextInt();

    int area = (base * h) / 2;
    System.out.println("AREA: " + area);
    scanner.close();
  }
}
