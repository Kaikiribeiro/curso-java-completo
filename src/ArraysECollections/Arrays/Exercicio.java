package ArraysECollections.Arrays;

import java.util.Scanner;

public class Exercicio {
  static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite a quantidade de notas: ");
    int qtNotas = sc.nextInt();

    double[] notas = new double[qtNotas];

    for (int i = 0; i < notas.length; i++) {
      System.out.print("Informe a nota " + (i + 1) + ": ");
      notas[i] = sc.nextDouble();
    }
    double soma = 0;
    for (double nota : notas) {
      soma += nota;
    }

    System.out.println("A média do Aluno: " + (soma / notas.length));

    sc.close();
  }
}
