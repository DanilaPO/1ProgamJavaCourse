import java.util.Scanner;

// предыдущее название DialogPanel
public class Greeting {
    /**
     * Программа диалога-приветствия
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        System.out.printf("Привет, %s!", name); // выдает ответ
    }
}