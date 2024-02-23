import java.util.Scanner;

// предыдущее название DialogRectangle
public class RectangleAreaAndPerimeterHomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину прямоугольника: ");
        double length = scanner.nextDouble();

        System.out.print("Введите ширину прямоугольника: ");
        double width = scanner.nextDouble();

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.printf("Площадь прямоугольника = %.2f%n", area);
        System.out.printf("Периметр прямоугольника = %.2f", perimeter);
    }
}