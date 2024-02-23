import java.util.Scanner;

public class NumbersSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел: ");
        int numbersCount = scanner.nextInt();

        int i = 0;
        int sum = 0;

        while (i <= numbersCount) {
            if (i % 2 != 0) {
                sum += Math.pow(i, 2);
            } else {
                sum -= Math.pow(i, 2);
            }

            ++i;
        }

        System.out.print("Сумма ряда чисел = " + sum);
    }
}