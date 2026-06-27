import java.util.Scanner;

public class Universidade {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite o nome da materia: ");
    String materia = sc.nextLine();
    System.out.print("\nDigite a nota Final: ");
    double nota = sc.nextDouble();
    System.out.print("\nDigite a frequencia: ");
    int frequencia = sc.nextInt();

    String status = nota > 7.0 && frequencia >= 75 ? "Aprovado" : "Reprovado";

    String aviso = materia.equalsIgnoreCase("Calculo") ? "Atenção: Disciplina de exatas!" : "";

    System.out.printf("Nome da Materia: %s \nStatus: %s \n%s", materia, status, aviso);

    sc.close();
  }
}
