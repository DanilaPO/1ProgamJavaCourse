import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayInFile {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(new FileInputStream("input.txt"))) {
            int numbersCount = scanner.nextInt();
            double[] numbers = new double[numbersCount];

            for (int i = 0; i < numbersCount; ++i) {
                numbers[i] = scanner.nextDouble();
            }

            System.out.println(Arrays.toString(numbers));
        }
    }
}