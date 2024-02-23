import java.util.Scanner;

// предыдущее название EquaityNumber
public class NumbersEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое вещественное число: ");
        double number1 = scanner.nextDouble();

        System.out.print("Введите второе вещественное число: ");
        double number2 = scanner.nextDouble();

        final double epsilon = 1.0e-10;

        if (Math.abs(number1 - number2) <= epsilon) {
            System.out.print("Числа равны");
        } else {
            System.out.print("Числа не равны");
        }
    }
}