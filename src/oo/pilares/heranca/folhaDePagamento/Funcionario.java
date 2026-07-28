package oo.pilares.heranca.folhaDePagamento;

public class Funcionario {
  protected String nome;
  protected String cpf;
  protected double salarioBase;

  public Funcionario(String nome, String cpf, double salarioBase) {
    this.nome = nome;
    this.cpf = cpf;
    this.salarioBase = salarioBase;
  }

  public double calcularSalario() {
    return salarioBase;
  }

  public String getDescricao() {
    return String.format("%s - CPF: %s | Salário Final: R$ %.2f", nome, cpf, calcularSalario());
  }
}
