package oo.pilares.desafio;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeEstoque {
  List<Produto> produtos = new ArrayList<>();

  public void adicionarProduto(Produto produto) {
    if (produto != null) {
      produtos.add(produto);
    }
  }

  public double calcularValorEstoque() {
    double total = 0;
    for (Produto produto : produtos) {
      total += produto.calcularPrecoVenda();
    }
    return total;
  }

  public void gerarRelatorioGeral() {
    for (Produto produto : produtos) {
      System.out.println(produto.getExibicaoDetalhada());
    }
    System.out.printf("Valor Total: %.2f", calcularValorEstoque());
  }

  public void listarApenasImportados() {
    for (Produto produto : produtos) {
      if (produto instanceof Importavel imp) {
        System.out.println(
            produto.getExibicaoDetalhada() + " | Código de Rastreio: " + imp.getCodigoRastreio());
      }
    }
  }
}
