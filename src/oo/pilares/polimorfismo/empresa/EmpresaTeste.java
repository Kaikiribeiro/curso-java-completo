package oo.pilares.polimorfismo.empresa;

import oo.pilares.heranca.folhaDePagamento.Desenvolvedor;
import oo.pilares.heranca.folhaDePagamento.Gerente;

public class EmpresaTeste {
  public static void main(String[] args) {
    Empresa empresa = new Empresa();

    empresa.adicionarFuncionario(new Gerente("Ana", "111.222.333-44", 8000.0, 2000.0));

    empresa.adicionarFuncionario(new Desenvolvedor("Kaiki", "555.666.777-88", 5000.0, "PLENO"));
    empresa.adicionarFuncionario(new Desenvolvedor("Renato", "999.888.777-66", 3000.0, "JUNIOR"));

    empresa.imprimirRelatorioFolha();
    System.out.println(empresa.calcularTotalFolha());
  }
}
