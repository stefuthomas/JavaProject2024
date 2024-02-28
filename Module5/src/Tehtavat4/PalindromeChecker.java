package Tehtavat4;

public class PalindromeChecker {
    public boolean isPalindrome(String word) {
        word = word.toLowerCase();
        word = word.replace(" ", "");
        word = word.replace(",", "");
        StringBuilder reversed = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed.append(word.charAt(i));
        }
        return reversed.toString().equals(word);
    }
}
