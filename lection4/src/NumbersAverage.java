// прежнее название AverageOfNumber
public class NumbersAverage {
    public static void main(String[] args) {
        int evenNumbersCount = 0;
        int evenNumbersSum = 0;
        int numbersCount = 0;
        int numbersSum = 0;

        int firstNumber = 1;
        int lastNumber = 4;

        int i = firstNumber;

        while (i <= lastNumber) {
            if (i % 2 == 0) {
                evenNumbersSum += i;
                ++evenNumbersCount;
            }

            ++i;
            ++numbersCount;
            numbersSum += numbersCount;
        }

        double numbersAverage = (double) numbersSum / numbersCount;
        System.out.printf("Среднее арифметическое чисел диапазона = %.2f%n", numbersAverage);

        double evenNumbersAverage = (double) evenNumbersSum / evenNumbersCount;
        System.out.printf("Среднее арифметическое четных чисел = %.2f", evenNumbersAverage);
    }
}