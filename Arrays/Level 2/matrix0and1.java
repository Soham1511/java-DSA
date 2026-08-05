// import java.util.*;

// public class matrix0and1 {

//     public static void markRow(int arr[][],int i){
//         for(int j = 0; j<4;j++){
//             if(arr[i][j] != 0){
//                 arr[i][j] = -1;
//             }
//         }
//     }
//     public static void markClm(int arr[][],int j){
//         for(int i = 0; i<4;i++){
//             if(arr[i][j] != 0){
//                 arr[i][j] = -1;
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int[][] arr = new int[4][4];

//         for(int i = 0; i<4; i++){
//             for(int j = 0; j<4; j++){
//                 arr[i][j] = 1;
//             }
//         }
//         arr[1][1] = 0;
//         arr[1][2] = 0;
//         arr[2][2] = 0;

//         for(int i = 0; i<4; i++){
//             for(int j = 0; j<4; j++){
//                 if(arr[i][j] == 0){
//                     markRow(arr,i);
//                     markClm(arr,j);
//                 }
//             }
//         }

//         for(int i = 0; i<4; i++){
//             for(int j = 0; j<4; j++){
//                 if(arr[i][j] == -1){
//                     arr[i][j] = 0;
//                 }
//             }
//         }

//         for(int i = 0; i<4; i++){
//             for(int j = 0; j<4; j++){
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// better soln:

public class BetterSoln {

    public static void main(String[] args) {
        int[][] arr = new int[4][4];

        for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++){
                arr[i][j] = 1;
            }
        }
        arr[1][2] = 0;
        arr[1][3] = 0;
        arr[2][1] = 0;

        int[] row = new int[4];
        int[] clm = new int[4];

        for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++){
                if(arr[i][j] == 0){
                    row[i] = 1;
                    clm[j] = 1;
                }
            }
        }

        for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++){
                if(row[i] == 1 || clm[j] == 1){
                    arr[i][j] = 0;
                }
            }
        }
        
        for(int i = 0 ; i<4; i++){
            for(int j = 0; j<4; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
