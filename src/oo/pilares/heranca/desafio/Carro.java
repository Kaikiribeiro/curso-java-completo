package oo.pilares.heranca.desafio;

public class Carro {

  final int VELOCIDADEMAXIMA;
  int velocidadeAtual = 0;
  int delta = 5;

  Carro(int velocidadeMaxima) {
    VELOCIDADEMAXIMA = velocidadeMaxima;
  }

  void acelerar() {
    if (velocidadeAtual + delta > VELOCIDADEMAXIMA) {
      velocidadeAtual = VELOCIDADEMAXIMA;
    } else {
      velocidadeAtual += delta;
    }
  }

  void freiar() {
    if (velocidadeAtual >= 5) {
      velocidadeAtual -= 5;
    } else {
      velocidadeAtual = 0;
    }
  }
}
