class minRotationToDial{
    public static void main(String[] args) {
        String s = "0192837465";
        int totalRotation = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            int digit = ch - '0';
            if(i > 0){
                int prevDigit = s.charAt(i-1) - '0';
                int d = Math.abs(prevDigit - digit);
                totalRotation += Math.min(d, 10 - d);
            }
            else{
                int d = Math.abs(0 - digit);
                totalRotation += Math.min(d, 10 - d);
            }
        }
        System.out.println(totalRotation);
    }
}