package oo.pilares.heranca.folhaDePagamento;

public class Desenvolvedor extends Funcionario {
  private String nivel;

  public Desenvolvedor(String nome, String cpf, double salarioBase, String nivel) {
    super(nome, cpf, salarioBase);
    this.nivel = nivel;
  }

  @Override
  double calcularSalario() {
    if (nivel.equalsIgnoreCase("SENIOR")) {
      return super.calcularSalario() + (salarioBase * 0.3);
    } else if (nivel.equalsIgnoreCase("PLENO")) {
      return super.calcularSalario() + (salarioBase * 0.15);
    } else if (nivel.equalsIgnoreCase("JUNIOR")) {
      return super.calcularSalario();
    } else {
      return super.calcularSalario();
    }
  }
}
