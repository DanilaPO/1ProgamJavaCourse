public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {2, 4, 7, 8};
        int x = 0;
        int left = 0;
        int right = array.length - 1;

        System.out.println("Индекс искомого элемента массива рекурсией: " + binarySearchWithRecursion(array, left, right, x));
        System.out.println("Индекс искомого элемента массива циклом: " + binarySearchWithoutRecursion(array, x));
    }

    public static int binarySearchWithRecursion(int[] array, int left, int right, int x) {
        if (left > right) {
            return -1;
        }

        int middle = (left + right) / 2;

        if (array[middle] < x) {
            return binarySearchWithRecursion(array, middle + 1, right, x);
        }

        if (array[middle] > x) {
            return binarySearchWithRecursion(array, left, middle - 1, x);
        }

        return middle;
    }

    public static int binarySearchWithoutRecursion(int[] array, int x) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (array[middle] == x) {
                return middle;
            }

            if (array[middle] > x) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return -1;
    }
}