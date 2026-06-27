import java.util.Scanner;

public class Salario {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o valor bruto do salario do funcionario: ");
    double salario = sc.nextDouble();
    System.out.println("Salario Bruto: " + salario);
    double desconto = salario * 0.11;
    salario -= desconto;
    salario -= 150;
    desconto += 150;

    System.out.println("Desconto: " + desconto);
    System.out.println("Salario Liquido: " + salario);

    sc.close();
  }
}
