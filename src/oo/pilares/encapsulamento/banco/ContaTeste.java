package oo.pilares.encapsulamento.banco;

public class ContaTeste {
  public static void main(String[] args) {
    ContaBancaria conta = new ContaBancaria("12234-5", "Kaiki");

    conta.depositar(500);
    System.out.println(conta.getSaldo());

    conta.sacar(700);
    conta.sacar(200);

    System.out.println("Saldo final R$ " + conta.getSaldo());
  }
}
