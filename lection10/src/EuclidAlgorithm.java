import java.util.Scanner;

public class EuclidAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();

        if (number1 == 0 && number2 == 0) {
            System.out.print("НОД нельзя искать при нулевых значениях обоих чисел");
        } else {
            System.out.print("НОД = " + getGreatestCommonDivisor(number1, number2));
        }
    }

    public static int getGreatestCommonDivisor(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }

        return getGreatestCommonDivisor(number2, number1 % number2);
    }
}    