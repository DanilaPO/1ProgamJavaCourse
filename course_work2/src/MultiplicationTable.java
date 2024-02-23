import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер таблицы: ");
        int tableSize = scanner.nextInt();

        System.out.print("       |");

        for (int i = 1; i <= tableSize; ++i) {
            System.out.printf("%4d   |", i);
        }

        System.out.println();

        for (int i = 0; i <= tableSize; ++i) {
            System.out.print("________");
        }

        for (int i = 1; i <= tableSize; ++i) {
            System.out.println();
            System.out.printf("%4d   |", i);

            for (int j = 1; j <= tableSize; ++j) {
                System.out.printf("%4d    ", j * i);
            }
        }
    }
}