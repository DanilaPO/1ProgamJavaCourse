import java.util.Scanner;

public class BreakingCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String hiddenString = "Пароль";

        while (true) {
            System.out.print("Введите загаданную строку: ");
            String enteredString = scanner.nextLine();

            if (enteredString.equals(hiddenString)) {
                System.out.println("Строка введена верно");
                break;
            }

            System.out.println("Строка введена неверно");
        }
    }
}