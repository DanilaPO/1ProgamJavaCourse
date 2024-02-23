import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваш возраст: ");
        int userAge = scanner.nextInt();

        int ageLastDigit = userAge % 10;

        if (userAge < 1) {
            System.out.print("Вы слишком малы");
        } else if (userAge > 112) {
            System.out.print("Вы слишком стары");
        } else if (ageLastDigit > 4 || (userAge / 10) % 10 == 1 || ageLastDigit == 0) {
            System.out.printf("Вам %d лет", userAge);
        } else if (ageLastDigit == 1) {
            System.out.printf("Вам %d год", userAge);
        } else {
            System.out.printf("Вам %d года", userAge);
        }
    }
}