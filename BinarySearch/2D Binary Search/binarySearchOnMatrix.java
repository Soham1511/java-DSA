public class binarySearchOnMatrix {
    public static void main(String args[]){
        int matrix[][] = {{1,3,5,7}, {10,11,16,20}, {23,30,34,60}};
        int target = 3;
        boolean ans = false;
        int rows = matrix.length;
        int colums = matrix[0].length;
        int low = 0;
        int high = rows * colums - 1;
        while (low <= high) {
            int mid = low + (high - low)/2;
            int value = matrix[mid/colums][mid % colums];
            if(value == target){
                ans = true;
                break;
            }
            else if(value < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
