
public class appearsOne {
    public static void main(String args[]){
        
        int arr[] = {1,1,2,2,3,3,4,4};
        for(int i = 0; i<arr.length; i++){
            int find = arr[i];
            int count = 0;
            for(int j = 0; j<arr.length; j++){
                if(arr[j] == find){
                    count++;
                }
            }
            if(count == 1) {System.out.println(find);}
        }
        System.out.println("NO element found");
    }
}

// more optimal by using XOR;

// class appearsOne{
//     public static void main(String args[]){
//         int arr[] = {1,2,2,3,3,4,4,5};
//         int xor = 0;

//         for(int i = 0; i < arr.length; i++){
//             xor = xor ^ arr[i]; // 1^1^2^2^3^3^4^4^5
//             // 0^1 = 0; 1^1 == 0
//         }
//         System.out.println(xor);
//     }
// }
