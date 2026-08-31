import java.util.Arrays;
import java.util.Scanner;

public class inputinarray {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);  
       // System.out.println("length of array is n");
//        int n = sc.nextInt();

        // array of primitives
        /*
        int[] arr = new int[n];
        for (int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
         */
        Scanner sc1 = new Scanner(System.in);

        // array of objects
        String[] str  = new String[4];
        for ( int i = 0 ; i < str.length ; i++){
            str[i] = sc1.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
