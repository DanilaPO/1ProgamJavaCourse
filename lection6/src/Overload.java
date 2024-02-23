import java.util.Scanner;

public class Overload {
    public static int getTypeSize(byte number) {
        return 1;
    }

    public static int getTypeSize(short number) {
        return 2;
    }

    public static int getTypeSize(int number) {
        return 4;
    }

    public static int getTypeSize(long number) {
        return 8;
    }

    public static int getTypeSize(float number) {
        return 4;
    }

    public static int getTypeSize(double number) {
        return 8;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число byte: ");
        byte byteNumber = scanner.nextByte();

        System.out.print("Введите число short: ");
        short shortNumber = scanner.nextShort();

        System.out.print("Введите число int: ");
        int intNumber = scanner.nextInt();

        System.out.print("Введите число long: ");
        long longNumber = scanner.nextLong();

        System.out.print("Введите вещественное число float: ");
        float floatNumber = scanner.nextFloat();

        System.out.print("Введите вещественное число double: ");
        double doubleNumber = scanner.nextDouble();

        System.out.println("Размер числа byte: " + getTypeSize(byteNumber));
        System.out.println("Размер числа short: " + getTypeSize(shortNumber));
        System.out.println("Размер числа int: " + getTypeSize(intNumber));
        System.out.println("Размер числа long: " + getTypeSize(longNumber));
        System.out.println("Размер числа float: " + getTypeSize(floatNumber));
        System.out.println("Размер числа double: " + getTypeSize(doubleNumber));
    }
}
