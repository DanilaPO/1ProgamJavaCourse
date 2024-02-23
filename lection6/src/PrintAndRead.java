import java.util.Scanner;

// для меня условия задачи сформулированы не понятно
public class PrintAndRead {
    public static void main(String[] args) {
        int a = printAndRead("Введите число:");
        System.out.print(a);
    }

    public static int printAndRead(String promptForInput) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(promptForInput);

        return scanner.nextInt();
    }
}