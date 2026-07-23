package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
  final List<Item> itens = new ArrayList<>();

  void adicionarItens(Item item) {
    this.itens.add(item);
  }

  void adicionarItem(int quantidade, Produto p) {
    this.itens.add(new Item(quantidade, p));
  }

  void adicionarItem(int quantidade, String nome, double preco) {
    this.itens.add(new Item(quantidade, new Produto(nome, preco)));
  }

  double obterValorTotal() {
    double total = 0;
    for (Item i : itens) {
      total += i.quantidade * i.produto.preco;
    }

    return total;
  }
}
