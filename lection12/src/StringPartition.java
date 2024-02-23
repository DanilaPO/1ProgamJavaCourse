import java.util.Arrays;

public class StringPartition {
    public static void main(String[] args) {
        String numbersString = "1, 2, 3, 4, 5";

        String[] stringsArray = numbersString.split(", ");

        int[] numbersArray = new int[stringsArray.length];

        int arrayNumbersSum = 0;

        for (int i = 0; i < stringsArray.length; ++i) {
            numbersArray[i] = Integer.parseInt(stringsArray[i]);
            arrayNumbersSum += numbersArray[i];
        }

        System.out.println("Сумма чисел массива = " + arrayNumbersSum);
        System.out.println(Arrays.toString(numbersArray));
    }
}