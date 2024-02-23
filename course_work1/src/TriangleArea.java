import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите координаты точки x1: ");
        double x1 = scanner.nextDouble();

        System.out.print("Введите координаты точки y1: ");
        double y1 = scanner.nextDouble();

        System.out.print("Введите координаты точки x2: ");
        double x2 = scanner.nextDouble();

        System.out.print("Введите координаты точки y2: ");
        double y2 = scanner.nextDouble();

        System.out.print("Введите координаты точки x3: ");
        double x3 = scanner.nextDouble();

        System.out.print("Введите координаты точки y3: ");
        double y3 = scanner.nextDouble();

        final double epsilon = 1.0e-10;

        if (Math.abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1)) <= epsilon) {
            System.out.print("Все точки треугольника лежат на одной прямой");
            return;
        }

        System.out.printf("Площадь треугольника = %.2f", getTriangleArea(x1, y1, x2, y2, x3, y3));
    }

    public static double getTriangleArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double triangleSide1Length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double triangleSide2Length = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        double triangleSide3Length = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));

        double semiPerimeter = (triangleSide1Length + triangleSide2Length + triangleSide3Length) / 2;

        return Math.sqrt(semiPerimeter * (semiPerimeter - triangleSide1Length) * (semiPerimeter - triangleSide2Length) * (semiPerimeter - triangleSide3Length));
    }
}