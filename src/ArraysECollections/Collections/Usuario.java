package ArraysECollections.Collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Usuario {
  String nome;
  String email;

  public Usuario(String nome, String email) {
    this.nome = nome;
    this.email = email;
  }

  Usuario() {}

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Usuario usuario = (Usuario) o;
    return Objects.equals(email, usuario.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email);
  }

  static void main(String[] args) {
    Usuario u1 = new Usuario("Kaiki", "kaiki@gmail.com");
    Usuario u2 = new Usuario("Ribeiro", "kaiki@gmail.com");

    System.out.println(u1.equals(u2));

    Set<Usuario> user = new HashSet<>();
    user.add(u1);

    System.out.println(user.contains(u2));
    ;
  }
}
