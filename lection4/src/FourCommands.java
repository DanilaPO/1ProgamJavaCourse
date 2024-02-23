import java.util.Scanner;

public class FourCommands {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double number1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double number2 = scanner.nextDouble();

        System.out.print("Введите номер команды 1-4: ");
        int commandCode = scanner.nextInt();

        switch (commandCode) {
            case 1:
                double numbersSum = number1 + number2;
                System.out.print("Результат операции суммы: " + numbersSum);
                break;
            case 2:
                double numbersDifference = number1 - number2;
                System.out.print("Результат операции вычитания: " + numbersDifference);
                break;
            case 3:
                double numbersProduct = number1 * number2;
                System.out.print("Результат операции умножения: " + numbersProduct);
                break;
            case 4:
                double numbersQuotient = number1 / number2;
                System.out.printf("Результат операции деления: %.2f", numbersQuotient);
                break;
            default:
                System.out.print("Неизвестная команда");
        }
    }
}
