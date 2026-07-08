package ClasseEMetodo;

public class Jantar {
  public static void main(String[] args) {
    Comida c1 = new Comida(0.223, "Feijão");
    Comida c2 = new Comida(0.3, "Arroz");

    Pessoa p1 = new Pessoa(55, "Kaiki");
    System.out.println(p1.peso);
    p1.comer(c1);
    System.out.println(p1.peso);
    p1.comer(c2);
    System.out.println(p1.peso);
  }
}
