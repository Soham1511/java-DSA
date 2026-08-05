import java.util.*;
class longestSubstringWithDistinctK {
    public int longestSubstringWithDistinct(String s, int k) {
        if (s == null || s.length() == 0 || k <= 0) {
            return 0;
        }

        int maxLength = 0;
        Map<Character, Integer> charCountMap = new HashMap<>();
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            charCountMap.put(currentChar, charCountMap.getOrDefault(currentChar, 0) + 1);

            while (charCountMap.size() > k) {
                char leftChar = s.charAt(left);
                charCountMap.put(leftChar, charCountMap.get(leftChar) - 1);
                if (charCountMap.get(leftChar) == 0) {
                    charCountMap.remove(leftChar);
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
    public static void main(String[] args) {
        longestSubstringWithDistinctK solution = new longestSubstringWithDistinctK();
        String s = "eceba";
        int k = 2;
        int result = solution.longestSubstringWithDistinct(s, k);
        System.out.println("The length of the longest substring with at most " + k + " distinct characters is: " + result);
    }
}