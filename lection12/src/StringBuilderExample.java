public class StringBuilderExample {
    public static void main(String[] args) {
        int firstNumber = 1;
        int lastNumber = 100;

        printNumbersStringByStringBuilder(firstNumber, lastNumber);
    }

    public static void printNumbersStringByStringBuilder(int firstNumber, int lastNumber) {
        StringBuilder sb = new StringBuilder();

        for (int i = firstNumber; i <= lastNumber; ++i) {
            sb.append(i)
                    .append(", ");
        }

        sb.delete(sb.length() - 2, sb.length());
        System.out.print(sb);
    }
}