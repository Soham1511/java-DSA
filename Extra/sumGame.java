class sumGame{
    public static void main(String[] args) {
        String s = "90";
        int n = s.length();
        int sum1 = 0;
        int sum2 = 0;
        int half = s.length() / 2;
        int cnt1 = 0, cnt2 = 0;
        for (int i = 0; i < half; i++) {
            char c = s.charAt(i);
            if (c == '?') cnt1++;
            else sum1 += c - '0';
        }

        for (int i = half; i < n; i++) {
            char c = s.charAt(i);
            if (c == '?') cnt2++;
            else sum2 += c - '0';
        }
        int diff = sum1 - sum2;
        int totalCnt = cnt1 + cnt2;
        if(totalCnt % 2 != 0) System.out.println(true);

        int forcedSwing = (cnt2 - cnt1) / 2 * 9;
        System.out.println(diff != forcedSwing);
    }
}