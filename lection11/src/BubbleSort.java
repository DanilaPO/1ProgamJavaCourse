import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {4, 1, 6, 12, 2, 5, 11, 8, 10, 9, 7};

        sortArray(array);

        System.out.print(Arrays.toString(array));
    }

    public static void sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; ++i) {
            boolean needSort = false;

            for (int j = 1; j < array.length - i; ++j) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;

                    needSort = true;
                }
            }

            if (!needSort) {
                return;
            }
        }
    }
}