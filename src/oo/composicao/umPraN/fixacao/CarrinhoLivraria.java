package oo.composicao.umPraN.fixacao;

import java.util.ArrayList;

public class CarrinhoLivraria {
  ArrayList<ItemCompra> itens = new ArrayList<>();

  void adicionarItem(Livro livro, int quantidade) {
    ItemCompra novoItem = new ItemCompra(livro, quantidade);

    this.itens.add(novoItem);
  }

  void adicionarItem(String titulo, String autor, double preco, int quantidade) {
    Livro novoLivro = new Livro(titulo, preco, autor);
    this.adicionarItem(novoLivro, quantidade);
  }

  double getValorTotal() {
    double total = 0;

    for (ItemCompra item : itens) {
      total += item.getSubtotal();
    }

    return total;
  }
}
