import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class EntriesCount {
    public static void main(String[] args) throws IOException {
        try (Scanner fileScanner = new Scanner(new FileInputStream("text.txt"));
             Scanner consoleScanner = new Scanner(System.in)) {
            System.out.print("Введите искомую строку: ");
            String searchString = consoleScanner.nextLine();

            System.out.print("Количество вхождений: " + getEntriesCount(searchString, fileScanner));
        }
    }

    public static int getEntriesCount(String searchString, Scanner scanner) {
        searchString = searchString.toLowerCase();

        int entriesCount = 0;
        int searchStringLength = searchString.length();

        while (scanner.hasNextLine()) {
            String fileString = scanner.nextLine().toLowerCase();

            int index = 0;

            while (true) {
                index = fileString.indexOf(searchString, index);

                if (index == -1) {
                    break;
                }

                ++entriesCount;
                index += searchStringLength;
            }
        }

        return entriesCount;
    }
}