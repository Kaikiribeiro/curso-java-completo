import java.util.Scanner;

public class TemperaturaInversa {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");

        float cel = scanner.nextFloat();

        float fah = (cel * 5 / 9) + 32;

        System.out.printf("Temperatura: %.2f C° == %.2f F°", cel, fah);

        scanner.close();
    }
}
