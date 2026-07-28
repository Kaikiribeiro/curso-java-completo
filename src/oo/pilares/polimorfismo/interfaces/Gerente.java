package oo.pilares.polimorfismo.interfaces;

import oo.pilares.heranca.folhaDePagamento.Funcionario;

public class Gerente extends Funcionario implements Autenticavel {
  private String senha = "123";

  public Gerente(String nome, String cpf, double salarioBase) {
    super(nome, cpf, salarioBase);
  }

  @Override
  public boolean autenticar(String senhaInforrmada) {
    return this.senha.equals(senhaInforrmada);
  }
}
