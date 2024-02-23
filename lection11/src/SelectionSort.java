import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {6, 1, 3, 2, 7, 10, 11, 9};

        sortArray(array);

        System.out.println(Arrays.toString(array));
    }

    public static void sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; ++i) {
            int minElementIndex = i;

            for (int j = i + 1; j < array.length; ++j) {
                if (array[j] < array[minElementIndex]) {
                    minElementIndex = j;
                }
            }

            int temp = array[minElementIndex];
            array[minElementIndex] = array[i];
            array[i] = temp;
        }
    }
}