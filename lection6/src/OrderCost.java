import java.util.Scanner;

// Условие задачи противоречит замечанию "Скидка за 2 условия может быть не обязательно равна удвоенной скидке за одно из условий." - так как в задаче прямо говорится о суммарном количестве и стоимости товаров. Вообще не понятно, что требуется
public class OrderCost {
    public static double getOrderCost(int type1GoodsQuantity, double type1GoodsPrice, int type2GoodsQuantity, double type2GoodsPrice) {
        double orderCost = type1GoodsQuantity * type1GoodsPrice + type2GoodsQuantity * type2GoodsPrice;
        int goodsQuantity = type1GoodsQuantity + type2GoodsQuantity;

        final double orderCostForDiscount = 1000;
        final double goodsQuantityForDiscount = 10;
        final double discountForOneCondition = 5;
        final double discountForBothConditions = 10;
        final double hundredPercent = 100;
        final double epsilon = 1.0e-10;

        if (goodsQuantity >= goodsQuantityForDiscount && orderCostForDiscount - orderCost <= epsilon) {
            return orderCost - orderCost / hundredPercent * discountForBothConditions;
        }

        if (goodsQuantity >= goodsQuantityForDiscount || orderCostForDiscount - orderCost <= epsilon) {
            return orderCost - orderCost / hundredPercent * discountForOneCondition;
        }

        return orderCost;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество товаров первого типа: ");
        int type1GoodsQuantity = scanner.nextInt();

        System.out.print("Введите стоимость одного товара первого типа: ");
        double type1GoodsPrice = scanner.nextDouble();

        System.out.print("Введите количество товаров второго типа: ");
        int type2GoodsQuantity = scanner.nextInt();

        System.out.print("Введите стоимость одного товара второго типа: ");
        double type2GoodsPrice = scanner.nextDouble();

        System.out.print("Итоговая стоимость заказа = " + getOrderCost(type1GoodsQuantity, type1GoodsPrice, type2GoodsQuantity, type2GoodsPrice));
    }
}