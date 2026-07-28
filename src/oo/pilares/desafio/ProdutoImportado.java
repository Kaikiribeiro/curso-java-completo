package oo.pilares.desafio;

public class ProdutoImportado extends Produto implements Importavel {
  double taxaAlfandega = 50;

  public ProdutoImportado(String codigo, double precoCusto, String nome, double taxaAlfandega) {
    super(codigo, precoCusto, nome);
    this.taxaAlfandega = taxaAlfandega;
  }

  @Override
  public double calcularPrecoVenda() {
    return (super.precoCusto * 1.30) + taxaAlfandega;
  }

  @Override
  public String getCodigoRastreio() {
    return "BR-IMP-" + super.getCodigo();
  }
}
