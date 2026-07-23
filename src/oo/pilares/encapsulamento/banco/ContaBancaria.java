package oo.pilares.encapsulamento.banco;

public class ContaBancaria {
  private String numeroDaConta;
  private String titular;
  private double saldo;

  public ContaBancaria(String numeroDaConta, String titular) {
    this.numeroDaConta = numeroDaConta;
    this.titular = titular;
    this.saldo = 0.0;
  }

  public String getNumeroDaConta() {
    return numeroDaConta;
  }

  public String getTitular() {
    return titular;
  }

  public double getSaldo() {
    return saldo;
  }

  void depositar(double valor) {
    if (valor > 0) {
      saldo += valor;
      System.out.printf("Depósito de R$ %.2f realizado!\n", valor);
    } else {
      System.out.println("Valor de depósito inválido!");
    }
  }

  void sacar(double valor) {
    if (valor <= saldo) {
      saldo -= valor;
      System.out.printf("Saque de R$ %.2f realizado!\n", valor);
    } else {
      System.out.println("Saldo insuficiente para realizar o saque!");
    }
  }
}
