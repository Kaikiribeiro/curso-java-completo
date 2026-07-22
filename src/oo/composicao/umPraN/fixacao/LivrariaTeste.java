package oo.composicao.umPraN.fixacao;

public class LivrariaTeste {
  static void main(String[] args) {
    CarrinhoLivraria carrinho1 = new CarrinhoLivraria();
    carrinho1.adicionarItem(new Livro("Pequeno Principe", 129.80, "Antonie"), 2);
    carrinho1.adicionarItem(new Livro("Dom Casmurro", 99.80, "Machado"), 5);
    carrinho1.adicionarItem("Entendendo Algoritmos", "Aditya", 49.99, 1);

    System.out.println(carrinho1.getValorTotal());
  }
}
