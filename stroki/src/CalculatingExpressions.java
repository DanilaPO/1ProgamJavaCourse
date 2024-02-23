// к заданию "Арифметика" в части операторов "-","+","*","/"
public class CalculatingExpressions {
    public static void main(String[] args) {
        double x = 3 - (double) (56 - 12) / 44 * 4 / 2;
        double y = 2 * x / (33 - x);
        double z = -x / (2 * y);
        System.out.printf("x = %.1f%ny = %.4f%nz = %.1f", x, y, z);
    }
}