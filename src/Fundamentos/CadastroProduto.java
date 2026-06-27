import java.util.Scanner;

public class CadastroProduto {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o nome do Produto: ");
    var nome = sc.nextLine();
    System.out.println("Digite o valor do Produto: ");
    double preco = sc.nextDouble();
    System.out.println("Digite a quantidade em Estoque: ");
    int estoque = sc.nextInt();
    System.out.println("Importação disponivel: ");
    boolean importacao = sc.nextBoolean();
    System.out.printf("Categoria Produto: ");
    char categoria = sc.next().charAt(0);

    System.out.printf(
        "\nNome do Produto: %s \nTamanho do Nome: %d \nValor Produto: %.2f \nQuantidade Estoque: %d \nDisponivel para Importação: %b \nCategoria Produto: %s",
        nome.toUpperCase(), nome.length(), preco, estoque, importacao, categoria);

    sc.close();
  }
}
