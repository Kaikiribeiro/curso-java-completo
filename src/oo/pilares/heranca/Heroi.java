package oo.pilares.heranca;

public class Heroi extends Jogador {

  Heroi(int x, int y) {
    super(x, y);
  }

  @Override
  boolean atacar(Jogador oponete) {
    super.atacar(oponete);
    super.atacar(oponete);
    return true;
  }
}
