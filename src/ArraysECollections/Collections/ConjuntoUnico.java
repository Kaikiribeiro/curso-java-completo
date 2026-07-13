package ArraysECollections.Collections;

import java.util.HashSet;

public class ConjuntoUnico {

  static void main(String[] args) {
    HashSet<String> convidados = new HashSet<>();

    convidados.add("Kaiki");
    convidados.add("Gabriel");
    convidados.add("Neto");
    convidados.add("Arthur");
    convidados.add("Pedro");

    convidados.add("Gabriel");
    // Não permitiu adicionar um nome repetido pois tratasse de um set, e um dos comportamentos de
    // set é não deixar colocar elementos repetido

    System.out.println(convidados.size());

    for (String convidado : convidados) {
      System.out.println("Convidado: " + convidado);
    }
  }
}
