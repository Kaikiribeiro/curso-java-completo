public class Bhaskara {
  static void main(String[] args) {
    int a = 1;
    int b = 12;
    int c = -13;

    double delta = Math.pow(b, 2) - (4 * a * c);

    double x1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / 2 * a;
    double x2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / 2 * a;

    System.out.println("X1: " + x1);
    System.out.println("X2: " + x2);

    System.out.println("Delta: " + delta);
  }
}
