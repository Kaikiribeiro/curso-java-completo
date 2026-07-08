package ClasseEMetodo;

public class Pessoa {
  String nome;
  double peso;

  public Pessoa(double peso, String nome) {
    this.peso = peso;
    this.nome = nome;
  }

  void comer(Comida comida) {
    if (comida != null) {
      this.peso += comida.pesoComida;
    }
  }
}
