import java.util.Scanner;

// прежнее название NumberFigure
public class NumberDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        int power = 0;
        int digitsSum = 0;
        int oddDigitsSum = 0;
        int maxDigit = 0;
        int dividedNumber = 1;

        while (dividedNumber >= 1) {
            dividedNumber = number / (int) Math.pow(10, power);
            int digit = dividedNumber % 10;
            digitsSum += digit;
            ++power;

            if (digit % 2 != 0) {
                oddDigitsSum += digit;
            }

            if (digit > maxDigit) {
                maxDigit = digit;
            }
        }

        System.out.println("Максимальная цифра числа = " + maxDigit);
        System.out.println("Сумма цифр числа = " + digitsSum);
        System.out.println("Сумма нечетных цифр числа = " + oddDigitsSum);
    }
}