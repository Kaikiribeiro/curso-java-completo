package oo.pilares.heranca.desafio;

public class Jetta extends Carro {

  public Jetta() {
    this(250);
  }

  public Jetta(int velociadeMaxima) {
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
