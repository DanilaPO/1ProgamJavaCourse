public class Palindrome {
    public static void main(String[] args) {
        String text = "  aboa";

        if (isPalindrome(text)) {
            System.out.print("Палиндром");
        } else {
            System.out.print("Не палиндром");
        }
    }

    public static boolean isPalindrome(String text) {
        text = text.toLowerCase();

        if (text.isEmpty()) {
            return true;
        }

        int leftIndex = 0;
        int rightIndex = text.length() - 1;

        while (leftIndex <= rightIndex) {
            while (!Character.isLetter(text.charAt(leftIndex))) {
                if (leftIndex == text.length() - 1) {
                    return true;
                }

                ++leftIndex;
            }

            while (!Character.isLetter(text.charAt(rightIndex))) {
                --rightIndex;
            }

            if (text.charAt(leftIndex) != text.charAt(rightIndex)) {
                return false;
            }

            ++leftIndex;
            --rightIndex;
        }

        return true;
    }
}