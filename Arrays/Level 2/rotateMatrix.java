import java.util.*;

public class rotateMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        Random random = new Random();

        for(int i = 0; i<n ; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = random.nextInt(10);
            }
        }

        System.out.println("Random nxn Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int ans[][] = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                ans[j][n-1-i] = arr[i][j];
            }
        }

        System.out.println("Rotated matrix: ");

        for(int i = 0; i < n; i++){
            for(int j = 0 ; j<n; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}// better approach will be generating transpose matrix of given
// matrix then just need to reverse each row. and that's it.
 