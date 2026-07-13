package ArraysECollections.Collections;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
  public static void main(String[] args) {

    List<Produto> produtos = new ArrayList<>();

    Produto p1 = new Produto("Caneta", 12.5);
    produtos.add(p1);

    produtos.add(new Produto("Borracha", 1.99));
    produtos.add(new Produto("Lapis", 2.99));

    produtos.remove(2);

    System.out.println("Quantidade de itens no carrinho: " + produtos.size());

    for (Produto produto : produtos) {
      System.out.printf("Nome: %s | Preço: R$ %.2f %n", produto.nome, produto.preco);
    }
  }
}
