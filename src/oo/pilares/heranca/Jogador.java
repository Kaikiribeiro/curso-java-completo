package oo.pilares.heranca;

public class Jogador {
  int x;
  int y;
  int vida = 100;

  Jogador(int x, int y) {
    this.x = x;
    this.y = y;
  }

  boolean atacar(Jogador oponete) {

    int deltaX = Math.abs(x - oponete.x);
    int deltaY = Math.abs(y - oponete.y);

    if (deltaX == 0 && deltaY == 1) {
      oponete.vida -= 10;
      return true;
    } else if (deltaX == 1 && deltaY == 0) {
      oponete.vida -= 10;
      return true;
    } else {
      return false;
    }
  }

  boolean andar(Direcao d) {
    switch (d) {
      case NORTE:
        y--;
        break;
      case SUL:
        y++;
        break;
      case LESTE:
        x++;
        break;
      case OESTE:
        x--;
        break;
    }
    return true;
  }
}
