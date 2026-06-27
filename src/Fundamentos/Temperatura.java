import java.util.Scanner;

public class Temperatura {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em Fahrenheit: ");

        float fah = scanner.nextFloat();

        float cel = (fah - 32) * 5 / 9;

        System.out.printf("Temperatura: %.2f F° == %.2f C°", fah, cel);

        scanner.close();

    }
}
