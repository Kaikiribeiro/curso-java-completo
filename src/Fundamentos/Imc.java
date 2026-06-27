import java.util.Scanner;

public class Imc {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();
        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        double imc = peso / (Math.pow(altura, 2));
        System.out.printf("Seu IMC: %.2f \n ", imc);

        scanner.close();
    }
}
