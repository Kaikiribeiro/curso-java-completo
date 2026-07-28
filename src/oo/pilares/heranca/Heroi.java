package oo.pilares.heranca;

public class Heroi extends Jogador {

  public Heroi(int x, int y) {
    super(x, y);
  }

  @Override
  public boolean atacar(Jogador oponete) {
    super.atacar(oponete);
    super.atacar(oponete);
    return true;
  }
}
