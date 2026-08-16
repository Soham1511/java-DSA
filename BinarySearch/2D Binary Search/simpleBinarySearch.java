class simpleBinarySearch{
    public static boolean findTarget(int a[][], int target){
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a[i].length; j++){
                if(a[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
public static void main(String args[]){
    int matrix[][] = {{1,3,5,7}, {10,11,16,20}, {23,30,34,60}};
    int target = 59;
    System.out.println(findTarget(matrix, target));
}
}