package oo.pilares.desafio;

public class Main {
  static void main(String[] args) {
    GerenciadorDeEstoque gerenciadorDeEstoque = new GerenciadorDeEstoque();

    gerenciadorDeEstoque.adicionarProduto(
        new ProdutoNacional("NAT-01", 150, "Teclado Mecânico", 0.12));

    gerenciadorDeEstoque.adicionarProduto(new ProdutoNacional("NAT-02", 600, "Monitor 24p", 0.15));

    gerenciadorDeEstoque.adicionarProduto(
        new ProdutoImportado("IMP-01", 800, "Processador Ryzen", 120.0));

    gerenciadorDeEstoque.adicionarProduto(
        new ProdutoImportado("IMP-02", 2500.00, "Placa de Video RTX", 350.00));

    gerenciadorDeEstoque.gerarRelatorioGeral();
    System.out.println();
    System.out.println("--------------------------------------------------");
    gerenciadorDeEstoque.listarApenasImportados();
  }
}
