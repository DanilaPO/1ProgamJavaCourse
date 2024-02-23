import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {4, 1, 2, 5, 7, 6, 9};

        quickSort(array, 0, array.length - 1);

        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }

        int x = array[(left + right) / 2];
        int i = left;
        int j = right;

        while (i <= j) {
            while (array[i] < x) {
                ++i;
            }

            while (array[j] > x) {
                --j;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;

                ++i;
                --j;
            }
        }

        if (i < right) {
            quickSort(array, i, right);
        }

        if (j > left) {
            quickSort(array, left, j);
        }
    }
}