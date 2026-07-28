package oo.pilares.heranca.folhaDePagamento;

public class FolhaDePagamentoTeste {
  public static void main(String[] args) {

    Funcionario gerente = new Gerente("Ana", "111.222.333-44", 8000.0, 2000.0);

    Funcionario dev1 = new Desenvolvedor("Kaiki", "555.666.777-88", 5000.0, "PLENO");
    Funcionario dev2 = new Desenvolvedor("Renato", "999.888.777-66", 3000.0, "JUNIOR");

    System.out.println(gerente.getDescricao());
    System.out.println(dev1.getDescricao());
    System.out.println(dev2.getDescricao());
  }
}
