import java.util.Arrays;
import java.util.Scanner;
public class MultiDimArray {
    public static void main(String[] args){
        //    int[][] arr = new int[3][2];
        //    arr[0][0] = 1;
        //    arr[0][1] = 2;
        //    arr[1][0] = 3;
        //    arr[1][1] = 4;
        //    arr[2][0] = 5;
        //    arr[2][1] = 6;
        //    System.out.println(Arrays.deepToString(arr));

        // input in 2d array


        int[][] arr = new int[3][2];
         System.out.println(arr.length); // 3 rows (number of rows)
        Scanner sc = new Scanner(System.in);
        for( int i = 0 ; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){ 
                // arr[i].length batata hai i row mei kitne column hai
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}