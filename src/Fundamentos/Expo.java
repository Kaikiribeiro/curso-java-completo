import java.util.Scanner;

public class Expo {
  static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um valor: ");
    int valor = scanner.nextInt();
    System.out.println("O valor " + valor + " ao quadrado é: " + Math.pow(valor, 2));
    System.out.println("O valor " + valor + " ao cubo é: " + Math.pow(valor, 3));
    scanner.close();
  }
}
