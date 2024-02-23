import java.util.Scanner;

// предыдущее название DialogRequirement
public class ParityAndMultiplicity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.print("четное, ");
        } else {
            System.out.print("нечетное, ");
        }

        if (number % 5 == 0) {
            System.out.print("кратное пяти");
        } else {
            System.out.print("не кратное пяти");
        }
    }
}