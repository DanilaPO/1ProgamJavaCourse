public class SortCheck {
    public static void main(String[] args) {
        int[] array = {8, 5, 4, 3};

        if (isArraySortedInAscendingOrder(array)) {
            System.out.print("Массив отсортирован по возрастанию");
        } else if (isArraySortedInDescendOrder(array)) {
            System.out.print("Массив отсортирован по убыванию");
        } else {
            System.out.print("Массив не отсортирован");
        }
    }

    public static boolean isArraySortedInAscendingOrder(int[] array) {
        for (int i = 1; i < array.length; ++i) {
            if (array[i - 1] > array[i]) {
                return false;
            }
        }

        return true;
    }

    public static boolean isArraySortedInDescendOrder(int[] array) {
        for (int i = 1; i < array.length; ++i) {
            if (array[i - 1] < array[i]) {
                return false;
            }
        }

        return true;
    }
}