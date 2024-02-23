import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение числа \"a\": ");
        double a = scanner.nextDouble();

        System.out.print("Введите значение числа \"b\": ");
        double b = scanner.nextDouble();

        System.out.print("Введите значение числа \"c\": ");
        double c = scanner.nextDouble();

        double epsilon = 1.0e-10;

        if (Math.abs(a) <= epsilon) {
            if (Math.abs(b) > epsilon) {
                double x = -c / b;
                System.out.print("Значение \"x\" = " + x);
            } else {
                if (Math.abs(c) <= epsilon) {
                    System.out.print("Уравнение имеет бесконечное множество корней");
                } else {
                    System.out.print("Уравнение не имеет корней");
                }
            }
        } else {
            double discriminant = Math.pow(b, 2) - 4 * a * c;

            if (Math.abs(discriminant) <= epsilon) {
                double x = -b / (2 * a);
                System.out.print("Значение \"x\" = " + x);
            } else if (discriminant > epsilon) {
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.printf("Значение x1 = %.2f; Значение x2 = %.2f", x1, x2);
            } else {
                System.out.print("Корней нет");
            }
        }
    }
}