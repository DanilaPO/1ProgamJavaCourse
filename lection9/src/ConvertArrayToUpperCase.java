import java.util.Arrays;

public class ConvertArrayToUpperCase {
    public static void main(String[] args) {
        String[] array = {"Hello! World"};

        convertToUpperCase(array);

        System.out.print(Arrays.toString(array));
    }

    public static void convertToUpperCase(String[] array) {
        for (int i = 0; i < array.length; ++i) {
            array[i] = array[i].toUpperCase();
        }
    }
}