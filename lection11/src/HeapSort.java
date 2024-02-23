import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] array = {10, 3, 14, 6, 8, 4, 7, 1, 12};

        heapSort(array);

        System.out.print(Arrays.toString(array));
    }

    public static void heapSort(int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; --i) {
            sift(array, array.length, i);
        }

        for (int i = array.length - 1; i > 0; --i) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            sift(array, i, 0);
        }
    }

    public static void sift(int[] array, int arrayLength, int i) {
        while (true) {
            int rightChildIndex = 2 * i + 2;
            int maxChildIndex = 2 * i + 1;

            if (rightChildIndex < arrayLength && array[maxChildIndex] < array[rightChildIndex]) {
                maxChildIndex = rightChildIndex;
            }

            if (maxChildIndex < arrayLength && array[i] < array[maxChildIndex]) {
                int temp = array[i];
                array[i] = array[maxChildIndex];
                array[maxChildIndex] = temp;

                i = maxChildIndex;
            }

            if (i != maxChildIndex) {
                return;
            }
        }
    }
}