package oo.pilares.heranca;

public class Jogo {
  static void main(String[] args) {
    Jogador h1 = new Heroi(10, 10);

    Jogador j2 = new Monstro();
    j2.x = 10;
    j2.y = 11;

    h1.atacar(j2);
    j2.atacar(h1);
    System.out.println(j2.vida);
    System.out.println(h1.vida);
  }
}
