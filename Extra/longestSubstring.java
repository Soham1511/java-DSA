import java.util.Arrays;

class longestSubstring{
    public static void main(String[] args) {
        String s = "abyzz";
        String query = "aa";
        int indices[] = {2,1};
        StringBuilder sb = new StringBuilder(s);
        int ans[] = new int[query.length()];
        for(int i = 0; i<query.length(); i++){
            char toChange = query.charAt(i);
            int idx = indices[i];
            sb.setCharAt(idx, toChange);
            int j = 0;
            int maxLen = 0;
            for(int k = 0; k < sb.length(); k++){
                if(sb.charAt(k) != sb.charAt(j)){
                    j = k;
                }
                int currLen = k - j + 1;
                maxLen = Math.max(maxLen, currLen);
            }
            ans[i] = maxLen;
        }
        System.out.println(Arrays.toString(ans));
    }
}
// leetcode 2213. test cases passed = 47 / 57. Got TLE because n * k scans. approach is correct.