import java.util.Scanner;

public class CaixaEletronico {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    double saldoInicial = 1000.00;

    System.out.print("Digite o valor do saque: ");
    double valorSaque = sc.nextDouble();

    boolean valorOk = valorSaque <= saldoInicial;
    boolean multiplo2 = valorSaque % 2 == 0;

    double atualiza = valorOk && multiplo2 ? saldoInicial - valorSaque : saldoInicial;
    String aviso =
        !valorOk
            ? "Saldo Insuficiente!"
            : !multiplo2
                ? "Erro: O caixa possui apenas notas de R$ 2,00!"
                : "Saque realizado com sucesso!";

    System.out.printf("Valor Atual: %.2f \n%s", atualiza, aviso);

    sc.close();
  }
}
