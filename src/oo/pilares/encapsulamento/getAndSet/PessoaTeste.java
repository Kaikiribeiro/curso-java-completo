package oo.pilares.encapsulamento.getAndSet;

public class PessoaTeste {
  static void main(String[] args) {
    Pessoa p1 = new Pessoa(20);
    p1.setIdade(-30);

    System.out.println(p1.getIdade());
  }
}
