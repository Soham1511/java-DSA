class validPalindrome{
    public static void main(String[] args){
        String s = "afgfea";
        int left = 0;
        int right = s.length() - 1;
        boolean result = isPalindrome(s, left, right);
        System.out.println(result);
    }
    public static boolean isPalindrome(String s, int left, int right){
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }
}