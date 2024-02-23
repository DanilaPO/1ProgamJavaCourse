import java.util.Arrays;

public class ArrayReversal {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};

        revertArray(array);

        System.out.println(Arrays.toString(array));
    }

    public static void revertArray(int[] array) {
        int halfArrayLength = array.length / 2;

        for (int i = 0; i < halfArrayLength; ++i) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}