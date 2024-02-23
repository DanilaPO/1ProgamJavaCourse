import java.util.Scanner;

public class TenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начальное число: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Введите конечное число: ");
        int lastNumber = scanner.nextInt();

        System.out.print("Сколько чисел в строке: ");
        int numbersCountInLine = scanner.nextInt();

        int numbersCount = 0;

        int i = firstNumber;

        while (i <= lastNumber) {
            System.out.printf("%10d", i);

            ++numbersCount;

            if (numbersCount == numbersCountInLine) {
                numbersCount = 0;
                System.out.println();
            }

            ++i;
        }
    }
}