import java.util.Scanner;

public class Contribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму вклада: ");
        double depositAmount = scanner.nextDouble();

        System.out.print("Введите размер процентной ставки годовых: ");
        double annualPercentageRate = scanner.nextDouble();

        final double hundredPercent = 100;
        final int monthsInYearCount = 12;
        double annualPercentageRateInMonth = (annualPercentageRate / hundredPercent) / monthsInYearCount;

        System.out.print("Введите срок размещения вклада: ");
        int depositTerm = scanner.nextInt();

        double depositInterestWithoutCapitalization = depositAmount * annualPercentageRateInMonth * depositTerm;
        double contributionWithPercentageWithCapitalization = depositAmount;

        for (int i = 0; i < depositTerm; ++i) {
            double depositInterestWithCapitalization = contributionWithPercentageWithCapitalization * annualPercentageRateInMonth;
            contributionWithPercentageWithCapitalization += depositInterestWithCapitalization;
        }

        System.out.printf("Размер вклада с процентами и без капитализации = %.2f%nПрибыль от вклада без капитализации " +
                "= %.2f%n", depositInterestWithoutCapitalization + depositAmount, depositInterestWithoutCapitalization);
        System.out.printf("Размер вклада с процентами и с капитализацией = %.2f%nПрибыль от вклада с капитализацией " +
                "капитализации = %.2f", contributionWithPercentageWithCapitalization,
                contributionWithPercentageWithCapitalization - depositAmount);
    }
}