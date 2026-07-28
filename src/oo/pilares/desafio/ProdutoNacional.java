package oo.pilares.desafio;

public class ProdutoNacional extends Produto {
  double impostoEstadual;

  public ProdutoNacional(String codigo, double precoCusto, String nome, double impostoEstadual) {
    super(codigo, precoCusto, nome);
    this.impostoEstadual = impostoEstadual;
  }

  @Override
  public double calcularPrecoVenda() {
    return precoCusto * (1 + impostoEstadual + 0.20);
  }
}
