public class ElementSearch {
    public static void main(String[] args) {
        double[] array = {1, 2, 5, 8, 9, 10};

        double desiredElement = 0;

        System.out.print(getElementIndex(array, desiredElement));
    }

    public static int getElementIndex(double[] array, double desiredElement) {
        final double epsilon = 1.0e-10;

        for (int i = 0; i < array.length; ++i) {
            if (Math.abs(array[i] - desiredElement) <= epsilon) {
                return i;
            }
        }

        return -1;
    }
}