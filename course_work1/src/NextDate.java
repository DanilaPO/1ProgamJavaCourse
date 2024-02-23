import java.util.Scanner;

public class NextDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число дня: ");
        int day = scanner.nextInt();

        System.out.print("Введите месяц: ");
        int month = scanner.nextInt();

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        int daysCountInMonth;

        if (month == 2 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            daysCountInMonth = 29;
        } else if (month == 2) {
            daysCountInMonth = 28;
        } else if ((month < 8 && month % 2 != 0) || (month >= 8 && month % 2 == 0)) {
            daysCountInMonth = 31;
        } else {
            daysCountInMonth = 30;
        }

        if (day > daysCountInMonth || month > 12 || month <= 0 || day <= 0) {
            System.out.print("Неверная дата");
            return;
        }

        if (daysCountInMonth == day) {
            day = 1;

            if (month == 12) {
                month = 1;
                ++year;
            } else {
                ++month;
            }
        } else {
            ++day;
        }

        System.out.printf("Следующая дата: %02d.%02d.%d", day, month, year);
    }
}
