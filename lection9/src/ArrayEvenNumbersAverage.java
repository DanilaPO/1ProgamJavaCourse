public class ArrayEvenNumbersAverage {
    public static void main(String[] args) {
        int[] array = {0, 2, 2, 2, 4, 2, 6};

        System.out.printf("Среднее арифметическое элементов массива, которые являются четными числами: %.2f", getArrayEvenNumbersAverage(array));
    }

    public static double getArrayEvenNumbersAverage(int[] array) {
        int evenNumbersCount = 0;
        int evenNumbersSum = 0;

        for (int e : array) {
            if (e % 2 == 0) {
                ++evenNumbersCount;
                evenNumbersSum += e;
            }
        }

        return (double) evenNumbersSum / evenNumbersCount;
    }
}