package oo.pilares.heranca.desafio;

public class Carro {

  final int VELOCIDADEMAXIMA;
  public int velocidadeAtual = 0;
  int delta = 5;

  protected Carro(int velocidadeMaxima) {
    VELOCIDADEMAXIMA = velocidadeMaxima;
  }

  public void acelerar() {
    if (velocidadeAtual + delta > VELOCIDADEMAXIMA) {
      velocidadeAtual = VELOCIDADEMAXIMA;
    } else {
      velocidadeAtual += delta;
    }
  }

  public void freiar() {
    if (velocidadeAtual >= 5) {
      velocidadeAtual -= 5;
    } else {
      velocidadeAtual = 0;
    }
  }
}
