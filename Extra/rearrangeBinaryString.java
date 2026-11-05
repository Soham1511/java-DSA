public class rearrangeBinaryString {
    public static void main(String[] args) {
        String s = "111111011111";
        boolean isFirstZeroFound = false;
        int time = 0;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '0' && isFirstZeroFound == false){
                isFirstZeroFound = true;
            }
            if(isFirstZeroFound == true && ch == '1'){
                time++;
            }
        }
        System.out.println(time);
    }
}
