package oo.pilares.polimorfismo.empresa;

import java.util.ArrayList;
import java.util.List;
import oo.pilares.heranca.folhaDePagamento.Funcionario;

public class Empresa {
  List<Funcionario> funcionarios = new ArrayList<>();

  void adicionarFuncionario(Funcionario f) {
    funcionarios.add(f);
  }

  double calcularTotalFolha() {
    double total = 0;
    for (Funcionario f : funcionarios) {
      total += f.calcularSalario();
    }
    return total;
  }

  void imprimirRelatorioFolha() {
    for (Funcionario f : funcionarios) {
      System.out.println(f.getDescricao());
    }
  }
}
