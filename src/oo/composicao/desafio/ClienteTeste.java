package oo.composicao.desafio;

public class ClienteTeste {
  static void main(String[] args) {
    Cliente cliente1 = new Cliente("Marcio");

    Compra compra1 = new Compra();
    compra1.adicionarItem(100, "Caneta", 9.67);
    compra1.adicionarItem(1, new Produto("Notebook", 1999.99));

    Compra compra2 = new Compra();
    compra2.adicionarItem(10, "Caderno", 10);
    compra2.adicionarItem(1, new Produto("Impressora", 998.97));

    cliente1.adicionarCompras(compra1);
    cliente1.compras.add(compra2);

    System.out.println("Na primeira compra gastou: " + compra1.obterValorTotal());
    System.out.printf("Total gasto do cliente %s: %.2f", cliente1.nome, cliente1.obterValorTotal());
  }
}
