import java.util.ArrayList;
import java.util.List;

public class returnAllPalindromeSubstrings {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println("All Palindrome Substrings: " + getAllPalindromeSubstrings(s));
        System.out.println();
    }

    public static List<String> getAllPalindromeSubstrings(String s) {
        List<String> result = new ArrayList<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            // Odd length palindromes
            expandAroundCenter(s, i, i, result);
            // Even length palindromes
            expandAroundCenter(s, i, i + 1, result);
        }
        int size = result.size();
        System.out.println("Number of Palindrome Substrings: " + size);
        return result;
    }

    private static void expandAroundCenter(String s, int left, int right, List<String> result) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            result.add(s.substring(left, right + 1));
            left--;
            right++;
        }
    }   
}
