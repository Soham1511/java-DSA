public class uniformParity {
    public static int countEven(int a[]){
        int even = 0;
        for(int i = 0; i<a.length; i++){
            if(a[i] % 2 == 0){
                even++;
            }
        }
        return even;
    }
    public static int countOdd(int a[]){
        int odd = 0;
        for(int i = 0; i<a.length; i++){
            if(a[i] % 2 != 0){
                odd++;
            }
        }
        return odd;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,6};
        int even = countEven(arr);
        int odd = countOdd(arr);
        boolean ans = false;
        if(even == odd && odd > 1){
            ans = true;
        }
        else{
            ans = false;
        }
        if(even < odd){
            ans = true;
        }
        else if(even > odd && odd <= 1){
            ans = false;
        }
        else if(even > odd && odd > 1){
            ans = true;
        }
        else if(even == arr.length){
            ans = true;
        }
        else if(odd == arr.length){
            ans = true;
        }
        System.out.println(ans);
    }
}
