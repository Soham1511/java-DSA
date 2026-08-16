public class searchOnUnsorted {
    public static void main(String[] args) {
        int matrix[][] = {{1,4,7,11,15}, {2,5,8,12,19}, {3,6,9,16,22}, {10,13,14,17,24}, {18,21,23,26,30}};
        int target = 5;
        int row = 0;
        int clm = matrix[0].length - 1;
        while(row < matrix.length && clm >= 0){
            if(target == matrix[row][clm]){
                System.out.println(true);
                break;
            }
            else if(target < matrix[row][clm]){
                clm--;
            }
            else{
                row++;
            }
        }
    }
}
