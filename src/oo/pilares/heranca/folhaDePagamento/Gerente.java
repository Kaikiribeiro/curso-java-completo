package oo.pilares.heranca.folhaDePagamento;

public class Gerente extends Funcionario {
  double bonusAnual;

  public Gerente(String nome, String cpf, double salarioBase, double bonusAnual) {
    super(nome, cpf, salarioBase);
    this.bonusAnual = bonusAnual;
  }

  @Override
  public double calcularSalario() {
    return super.calcularSalario() + bonusAnual;
  }
}
