import java.util.Scanner;

// предыдущее название TwoNumber
public class MaxAndMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое целое число: ");
        int number1 = scanner.nextInt();

        System.out.print("Введите второе целое число: ");
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println("Наибольшее число = " + number1);
            System.out.println("Наименьшее число = " + number2);
        } else if (number1 == number2) {
            System.out.println("Числа равны");
        } else {
            System.out.println("Наибольшее число = " + number2);
            System.out.println("Наименьшее число = " + number1);
        }
    }
}