package ArraysECollections.Collections;

import java.util.HashMap;
import java.util.Map;

public class CatalogoProdutos {
  public static void main(String[] args) {
    Map<Integer, String> produtos = new HashMap<>();

    produtos.put(1, "Celular");
    produtos.put(2, "Notebook");
    produtos.put(3, "Tablet");

    System.out.println("Produto da chave 2: " + produtos.get(2));

    for (int chave : produtos.keySet()) {
      System.out.println("Chave cadastrada: " + chave);
    }

    for (String valor : produtos.values()) {
      System.out.println("Produto: " + valor);
    }

    for (Map.Entry<Integer, String> registro : produtos.entrySet()) {
      System.out.printf("Código: %d -> Produto: %s%n", registro.getKey(), registro.getValue());
    }
  }
}
