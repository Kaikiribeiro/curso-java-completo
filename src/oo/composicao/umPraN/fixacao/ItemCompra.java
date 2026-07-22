package oo.composicao.umPraN.fixacao;

public class ItemCompra {
  Livro livro;
  int quantidade;

  public ItemCompra(Livro livro, int quantidade) {
    this.livro = livro;
    this.quantidade = quantidade;
  }

  double getSubtotal() {
    return livro.preco * quantidade;
  }
}
