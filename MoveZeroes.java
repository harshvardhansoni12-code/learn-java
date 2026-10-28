import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args){
        int[] nums = {0,1,0,3,12};
         int n = nums.length;
        if(n==1 && nums[0]==0){
           System.out.println(Arrays.toString(nums));
        }
        int i = 0;
        for(int k=0; k<n; k++){
            if(nums[k]==0){
                i=k;
                break;
            }
        }
         System.out.println(i);
         int j = i+1;
         while( j < n){
            if(nums[j]!=0){
                swap(nums, i, j);
                i++;
            }
            j++;
         }
         System.out.println(Arrays.toString(nums));
    }

 public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
