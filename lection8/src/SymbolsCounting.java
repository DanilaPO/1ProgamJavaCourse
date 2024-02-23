import java.util.Scanner;

public class SymbolsCounting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String enteredString = scanner.nextLine();

        int enteredStringLength = enteredString.length();

        int lettersCount = 0;
        int digitsCount = 0;
        int spacesCount = 0;
        int restSymbolsCount = 0;

        for (int i = 0; i < enteredStringLength; ++i) {
            char symbol = enteredString.charAt(i);

            if (Character.isLetter(symbol)) {
                ++lettersCount;
            } else if (Character.isDigit(symbol)) {
                ++digitsCount;
            } else if (Character.isWhitespace(symbol)) {
                ++spacesCount;
            } else {
                ++restSymbolsCount;
            }
        }

        System.out.println("Количество букв: " + lettersCount);
        System.out.println("Количество чисел: " + digitsCount);
        System.out.println("Количество пробелов: " + spacesCount);
        System.out.println("Количество остальных символов: " + restSymbolsCount);
    }
}