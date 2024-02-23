import java.util.Scanner;

// предыдущее название EmptyNumber
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int userNumber = scanner.nextInt();

        if (userNumber < 2) {
            System.out.print("Нет простых чисел");
        } else {
            System.out.println("Простые числа не более заданного числа:");

            for (int i = 2; i <= userNumber; ++i) {
                boolean isPrime = true;

                for (int j = 2; j < i; ++j) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.println(i);
                }
            }
        }
    }
}