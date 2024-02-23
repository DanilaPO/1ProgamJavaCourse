import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileConversionToUpperCase {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(new FileInputStream("text.txt"));
             PrintWriter writer = new PrintWriter("textOutput.txt")) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                writer.println(line.toUpperCase());
            }
        }
    }
}
