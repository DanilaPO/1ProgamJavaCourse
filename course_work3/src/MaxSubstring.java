public class MaxSubstring {
    public static void main(String[] args) {
        String text = "ttrrr";

        System.out.print("Длина максимальной подстроки: " + getMaxSubstringLength(text));
    }

    public static int getMaxSubstringLength(String text) {
        if (text.isEmpty()) {
            return 0;
        }

        text = text.toLowerCase();

        int currentSubstringLength = 1;
        int maxSubstringLength = 1;

        for (int i = 1; i < text.length(); ++i) {
            char previousSymbol = text.charAt(i - 1);
            char currentSymbol = text.charAt(i);

            if (previousSymbol == currentSymbol) {
                ++currentSubstringLength;

                if (maxSubstringLength < currentSubstringLength) {
                    maxSubstringLength = currentSubstringLength;
                }
            } else {
                currentSubstringLength = 1;
            }
        }

        return maxSubstringLength;
    }
}