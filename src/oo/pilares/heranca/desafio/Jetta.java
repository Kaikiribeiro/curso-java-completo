package oo.pilares.heranca.desafio;

public class Jetta extends Carro {

  Jetta() {
    this(250);
  }

  Jetta(int velociadeMaxima) {
    super(velociadeMaxima);
    delta = 225;
  }

  //  @Override
  //  void acelerar() {
  //    super.acelerar();
  //    super.acelerar();
  //    super.acelerar();
  //  }
}
