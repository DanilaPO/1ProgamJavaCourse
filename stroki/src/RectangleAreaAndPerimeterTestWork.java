import java.util.Scanner;

// предыдущее название RectanglePrintFormat
public class RectangleAreaAndPerimeterTestWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину прямоугольника: ");
        double length = scanner.nextDouble();

        System.out.print("Введите ширину прямоугольника: ");
        double width = scanner.nextDouble();

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.printf("Длина = %.2f; Ширина = %.2f; Площадь прямоугольника = %.2f; Периметр прямоугольника = %.2f",
                length, width, area, perimeter);
    }
}