import java.util.Arrays;

public class SUM {
    public static void main(String[] args){
        int[] nums = {2,6,5,8,11};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        // for(int i=0; i<nums1.length;i++){
        //     System.out.println(nums1[i]);
        // }
        int i = 0;
        int j = nums.length - 1;
        int target = 14;
        while (i < nums.length && j>=0){
            if(nums[i] + nums[j]<target){
                i++;
            }else if(nums[i] + nums[j]==target){
                System.out.println("Indices: [" + i + ", " + j + "]");
                break;
            }
            else{
                j--;
            }
        } 
    }
}
