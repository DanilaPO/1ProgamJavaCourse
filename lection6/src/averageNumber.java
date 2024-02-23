public class averageNumber {
    public static double isAverageNumber(double x, double y) {
        double sum = 0;

        if (y>=0) {
            while (x <= y) {
                sum += x;
                x++;
            }
        } else {
            while (x >= y) {
                sum += x;
                x--;
            }
        }
        return sum/x;
    }
    public static void main(String[] args) {
        System.out.print("Результат = " + isAverageNumber(-2, -3));
    }
}
