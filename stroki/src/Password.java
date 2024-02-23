import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = "Hello123";

        System.out.print("Введите пароль: ");
        String userLine = scanner.nextLine();

        if (userLine.equals(password)) {
            System.out.println("Пароль верный");
        } else if (userLine.length() > password.length()) {
            System.out.println("Пароль неверный и строка слишком длинная");
        } else if (userLine.length() < password.length()) {
            System.out.println("Пароль неверный и строка слишком короткая");
        } else {
            System.out.println("Пароль неверный");
        }
    }
}