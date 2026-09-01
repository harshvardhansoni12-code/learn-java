import java.util.Arrays;

public class passingfunction {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println("After change: " + Arrays.toString(arr)  );
    }
    static void change(int arr[]){ // change method
        arr[0] = 22;
    }
}
