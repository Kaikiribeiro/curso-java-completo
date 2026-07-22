package ArraysECollections.Collections;

import java.util.HashSet;

public class Hash {
  static void main(String[] args) {
    HashSet<Usuario> usuarios = new HashSet<Usuario>();

    usuarios.add(new Usuario("Ana", "ana@gmail.com"));
    usuarios.add(new Usuario("Maria", "maria@gmail.com"));
    usuarios.add(new Usuario("Gabriela", "gabriela@gmail.com"));

    boolean resultado = usuarios.contains(new Usuario("Gabriela", "gabriela@gmail.com"));
    System.out.println(resultado);
  }
}
