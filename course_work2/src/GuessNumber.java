import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        int attemptsCount = 0;

        while (true) {
            ++attemptsCount;

            System.out.print("Введите число, чтобы отгадать загаданное число от 1 до 100: ");
            int enteredNumber = scanner.nextInt();

            if (enteredNumber > randomNumber) {
                System.out.println("Ваше число больше загаданного");
            } else if (enteredNumber < randomNumber) {
                System.out.println("Ваше число меньше загаданного");
            } else {
                System.out.print("Вы отгадали число за количество попыток: " + attemptsCount);
                break;
            }
        }
    }
}