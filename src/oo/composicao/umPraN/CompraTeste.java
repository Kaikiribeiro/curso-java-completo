package oo.composicao.umPraN;

public class CompraTeste {
  static void main(String[] args) {
    Compra compra1 = new Compra();
    compra1.cliente = "Kaiki";
    compra1.adicionarItem(new Item("Caneta", 20, 11.50));
    compra1.adicionarItem(new Item("Borracha", 10, 1.99));
    compra1.adicionarItem(new Item("Caderno", 8, 18.75));

    System.out.println(compra1.obterValorTotal());
  }
}
