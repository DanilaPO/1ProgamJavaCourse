import java.util.Scanner;

// предыдущее название TwoNumberTernator
public class MaxAndMinByTernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое целое число: ");
        int number1 = scanner.nextInt();

        System.out.print("Введите второе целое число: ");
        int number2 = scanner.nextInt();

        if (number1 == number2) {
            System.out.println("Числа равны");
        } else {
            int max = (number1 > number2) ? number1 : number2;
            System.out.println("Наибольшее число = " + max);

            int min = (number1 < number2) ? number1 : number2;
            System.out.print("Наименьшее число = " + min);
        }
    }
}