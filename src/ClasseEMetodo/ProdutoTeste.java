package ClasseEMetodo;

public class ProdutoTeste {
  static void main(String[] args) {
    Produto p1 = new Produto();
    p1.nome = "Notebook";
    p1.preco = 4356.99;
    p1.desconto = 0.25;

    var p2 = new Produto();
    p2.nome = "Caneta Preta";
    p2.preco = 12.56;
    p2.desconto = 0.29;

    System.out.println(p1.nome);
    System.out.println(p2.nome);

    double mediaCarrinho = (p1.precoComDesconto(0) + p2.precoComDesconto(0.1)) / 2;

    System.out.printf("Media carrinho: %.2f", mediaCarrinho);
  }
}
