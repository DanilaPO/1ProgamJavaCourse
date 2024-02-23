public class Test {
    public static void main(String[] args) {

        int i = 3;
        int sum = 0;

        while (i <= 21) {

            if (i % 2 == 0) {
                sum = sum + i;
                ++i;
            } else {
                sum = sum + 0;
                ++i;
            }

        }
        System.out.print(sum);
    }

}