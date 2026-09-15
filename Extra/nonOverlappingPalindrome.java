public class nonOverlappingPalindrome {
    public static boolean isPalindrome(String s, int l, int r){
        while(l<r){
            if(s.charAt(r) != s.charAt(l)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "adbcda";
        int k = 2;
        int i = 0;
        int ans = 0;
        while(i + k <= s.length()){
            boolean found = false;
            for(int j = i + k - 1; j < s.length(); j++){
                boolean isPal = isPalindrome(s, i, j);
                if(isPal){
                    ans++;
                    i = j+1;
                    found = true;
                    break;
                }
            }
            if (!found) {
                i++;
            }
        }
        System.out.println(ans);
    }
}
