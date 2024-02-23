// прежнее название CycleDoWhile:
public class NumbersAverageDoWhile {
    public static void main(String[] args) {
        int numbersCount = 0;
        int numbersSum = 0;
        int evenNumbersCount = 0;
        int evenNumbersSum = 0;

        int firstNumber = 1;
        int lastNumber = 4;

        int i = firstNumber;

        do {
            if (i % 2 == 0) {
                evenNumbersSum += i;
                ++evenNumbersCount;
            }

            ++i;
            ++numbersCount;
            numbersSum += numbersCount;
        } while (i <= lastNumber);

        double numbersAverage = (double) numbersSum / numbersCount;
        double evenNumbersAverage = (double) evenNumbersSum / evenNumbersCount;

        System.out.printf("Среднее арифметическое чисел = %.2f%n", numbersAverage);
        System.out.printf("Среднее арифметическое четных чисел = %.2f", evenNumbersAverage);
    }
}