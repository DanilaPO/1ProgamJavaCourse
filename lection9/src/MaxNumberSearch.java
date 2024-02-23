public class MaxNumberSearch {
    public static void main(String[] args) {
        double[] array = {1, 2, 9, 4, 5, 10};

        System.out.print(getMaxNumber(array));
    }

    public static double getMaxNumber(double[] array) {
        double element = array[0];

        for (double e : array) {
            if (element < e) {
                element = e;
            }
        }

        return element;
    }
}