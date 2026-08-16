public class smallestDivisibleDigit {
    public static void main(String[] args) {
        int n = 10;
        int t = 2;
        int min = Integer.MAX_VALUE;
        for(int i = n; i<101; i++){
            int temp = i;
            int product = 1;
            while(temp > 0){
                product *= temp % 10;
                temp /= 10;
            }
            if(product % t == 0 && i < min){
                min = i;
            }
        }
        System.out.println(min);
    }
}
