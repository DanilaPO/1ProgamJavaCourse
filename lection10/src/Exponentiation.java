import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        System.out.print("Введите степень числа: ");
        int power = scanner.nextInt();

        System.out.println("Результат возведения числа в степень с помощью рекурсивной функции = " + raiseToPowerWithRecursion(number, power));
        System.out.println("Результат возведения числа в степень с помощью нерекурсивной функции = " + raiseToPowerWithoutRecursion(number, power));
    }

    public static int raiseToPowerWithRecursion(int number, int power) {
        if (power == 0) {
            return 1;
        }

        return raiseToPowerWithRecursion(number, power - 1) * number;
    }

    public static int raiseToPowerWithoutRecursion(int number, int power) {
        int result = 1;

        for (int i = 1; i <= power; ++i) {
            result *= number;
        }

        return result;
    }
}