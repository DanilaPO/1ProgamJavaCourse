import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер члена числовой последовательности чисел Фибоначчи: ");
        int fibonacciNumberIndex = scanner.nextInt();

        if (fibonacciNumberIndex == 0) {
            System.out.println("Число Фибоначчи = " + 0);
            return;
        }

        if (fibonacciNumberIndex == 1) {
            System.out.println("Число Фибоначчи = " + 1);
            return;
        }

        int previousFibonacciNumber = 0;
        int currentFibonacciNumber = 1;
        int nextFibonacciNumber = 0;

        int i = 0;

        while (i <= fibonacciNumberIndex - 2) {
            nextFibonacciNumber = currentFibonacciNumber + previousFibonacciNumber;
            previousFibonacciNumber = currentFibonacciNumber;
            currentFibonacciNumber = nextFibonacciNumber;

            i++;
        }

        System.out.println("Число Фибоначчи = " + nextFibonacciNumber);
    }
}