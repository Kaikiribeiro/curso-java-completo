package oo.pilares.desafio;

public abstract class Produto {
  protected String codigo;
  protected String nome;
  protected double precoCusto;

  public Produto(String codigo, double precoCusto, String nome) {
    this.codigo = codigo;
    setPrecoCusto(precoCusto);
    this.nome = nome;
  }

  public String getCodigo() {
    return codigo;
  }

  public String getNome() {
    return nome;
  }

  public double getPrecoCusto() {
    return precoCusto;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setPrecoCusto(double precoCusto) {
    if (precoCusto >= 0) {
      this.precoCusto = precoCusto;
    }
  }

  public abstract double calcularPrecoVenda();

  public String getExibicaoDetalhada() {
    return String.format(
        "%s %s - Preço de Custo: R$ %.2f | Preço de Venda: R$ %.2f",
        getCodigo(), getNome(), getPrecoCusto(), calcularPrecoVenda());
  }
}
