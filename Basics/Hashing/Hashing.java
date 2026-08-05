import java.util.*;
@SuppressWarnings("unused")
class Hashing{
    public static int countChar(String s, char c){
        int count = 0;
        for(int i = 0; i<s.length(); i++){
            if (s.charAt(i) == c) {
                count+=1;
            }
        }
        return count;
    }
    public static int countNumInArr(int arr[], int n){
        int count = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == n){
                count++;
            }
        }
        return count;
    }
    
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int arr[] = new int[] {1,2,1,3,1,1};
        // System.out.println(countNumInArr(arr, 3));
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.next().charAt(0);
        // System.out.println(countChar(s, c));
        int [] hash = new int[26];
        for(int i = 0; i<s.length();i++){
            hash[s.charAt(i) - 'a']++;
        }
        int q = sc.nextInt();
        while(q-- > 0){
            char n = sc.nextLine().charAt(0);
            System.out.println(hash[n-'a']);
        }
        
    }
}