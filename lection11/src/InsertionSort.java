import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {2, 1, 6, 5, 3, 7, 4};

        sortArray(array);

        System.out.print(Arrays.toString(array));
    }

    public static void sortArray(int[] array) {
        for (int i = 1; i < array.length; ++i) {
            int currentElement = array[i];
            int j = i;

            while (j > 0 && array[j - 1] > currentElement) {
                array[j] = array[j - 1];
                --j;
            }

            array[j] = currentElement;
        }
    }
}