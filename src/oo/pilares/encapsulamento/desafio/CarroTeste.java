package oo.pilares.encapsulamento.desafio;

import oo.pilares.heranca.desafio.Carro;
import oo.pilares.heranca.desafio.Fusca;
import oo.pilares.heranca.desafio.Jetta;

public class CarroTeste {
  static void main(String[] args) {
    Carro jetta = new Jetta();
    Carro fusca = new Fusca(100);

    System.out.println("Velocidade do fusca: " + fusca.velocidadeAtual);
    System.out.println("Velocidade do jetta: " + jetta.velocidadeAtual);

    jetta.acelerar();
    fusca.acelerar();

    System.out.println("Velocidade do fusca: " + fusca.velocidadeAtual);
    System.out.println("Velocidade do jetta: " + jetta.velocidadeAtual);

    jetta.freiar();
    fusca.freiar();
    fusca.freiar();
    jetta.freiar();

    System.out.println("Velocidade do fusca: " + fusca.velocidadeAtual);
    System.out.println("Velocidade do jetta: " + jetta.velocidadeAtual);
  }
}
