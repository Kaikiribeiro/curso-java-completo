package ClasseEMetodo;

public class ProdutoTeste {
  static void main(String[] args) {
    Produto p1 = new Produto();
    p1.nome = "Notebook";
    p1.preco = 4356.99;

    var p2 = new Produto();
    p2.nome = "Caneta Preta";
    p2.preco = 12.56;
    Produto.desconto = 0.29;

    Produto p3 = new Produto("Celular", 768.99);

    System.out.println(p1.nome);
    System.out.println(p2.nome);
    System.out.println(p3.nome);

    double mediaCarrinho =
        (p1.precoComDesconto(0) + p2.precoComDesconto(0.1) + p3.precoComDesconto(0)) / 3;

    System.out.printf("Media carrinho: %.2f", mediaCarrinho);
  }
}
