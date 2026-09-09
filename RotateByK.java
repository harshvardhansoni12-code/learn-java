import java.util.Arrays;

public class RotateByK {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7,7,8,9,0,8};
        int n = nums.length;
        int d = 3;
        int temp[] = new int[d];
        for ( int i = 0 ; i < d-1; i++){
            temp[i] = nums[i];
        }
        Rotate(nums ,  temp, d , n);
    }

    static void Rotate(int[] arr ,int[] temp , int d , int n ){
        for( int i = d ; i < n ; i++) {
            arr[ i - d ] = arr[ i ];
        }
        for( int j = n-d ; j < n ; j++) {
          temp[j] = temp[ j - (n - d)];
        }
        System.out.println(Arrays.toString(arr));
    }
}