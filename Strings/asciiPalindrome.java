public class asciiPalindrome {
    public static boolean isPalindrome(String s){
        int l = 0;
        int r = s.length() - 1;
        boolean ans = true;
        while (l < r) {
            if(s.charAt(l) != s.charAt(r)){
                ans = false;
            }
            l++;
            r--;
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "leet";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            StringBuilder temp = new StringBuilder();
            int num = s.charAt(i);
            if (num == 0) {
                temp.append('0');
            } else {
                while (num != 0) {
                    temp.append(num % 2);
                    num /= 2;
                }
            }
            while (temp.length() < 8) {
                temp.append('0');
            }
            sb.append(temp.reverse());
        }
        System.out.println(isPalindrome(sb.toString()));
    }
}
