import java.util.Arrays;
public class Rotate {
    public static void main(String[] args){
        // int[] nums = {-1,-100,3,99};
        // int k = 2;
          int[] nums = {1,2,3,4,5,6,7};
        int k = 3 ;
        System.out.println(nums.length);
       int n = nums.length;
      
       int l = n - 1;
       int s = n - k;
      
       while ( s < l ) {
        int temp = nums[s] ;
        nums[s] = nums[l] ;
        nums[l] = temp ;
        s++;
        l--;
       }
 System.out.println(Arrays.toString(nums));
  int i = 0;
  int d = k - 1 ;
   while ( i < d ) {
        int temp = nums[i] ;
        nums[i] = nums[d] ;
        nums[d] = temp ;
        i++;
        d--;
       }
       System.out.println(Arrays.toString(nums));
    
     int i1 = 0 ;
     int d1 = n-1;
     while ( i1 < d1) {
        int temp = nums[i1] ;
        nums[i1] = nums[d1] ;
        nums[d1] = temp ;
        i1++;
        d1--;
     }
System.out.println(Arrays.toString(nums));

    }

}
 