package ArraysECollections.Arrays;

import java.util.Scanner;

public class MediaMatriz {
  static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite a quantidade de Alunos: ");
    int qtdAlunos = sc.nextInt();
    System.out.print("Digite a quatidade de Notas de cada aluno: ");
    int qtdNotas = sc.nextInt();

    double[][] notasTurma = new double[qtdAlunos][qtdNotas];

    double somaTurma = 0;
    double[] somaAluno = new double[qtdAlunos];

    for (int i = 0; i < qtdAlunos; i++) {

      for (int j = 0; j < qtdNotas; j++) {
        System.out.printf("Digite a nota %d do aluno %d: ", j + 1, i + 1);
        notasTurma[i][j] = sc.nextDouble();
        somaTurma += notasTurma[i][j];
        somaAluno[i] += notasTurma[i][j];
      }
    }

    double mediaTurma = somaTurma / (qtdAlunos * qtdNotas);

    System.out.println("A media da turma: " + mediaTurma);

    for (int i = 0; i < qtdAlunos; i++) {
      System.out.printf("A media do aluno %d: %.2f \n", i + 1, (somaAluno[i] / qtdNotas));
    }

    sc.close();
  }
}
