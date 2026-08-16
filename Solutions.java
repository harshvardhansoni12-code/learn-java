// public class Solutions {
//     public static void main(String[] args){
//       int[] nums = new int[]{3,2,4};
//       int target = 6;
//      int i = 0;
//         for(int j=i+1 ; j<nums.length;j++){
//             if(nums[i]+nums[j]==target){
//                 System.out.println("[" + i + ", " + j + "]");
//             }
//             i++;
//         }
//     }
//     }
     
       /* access modifier returnType nName(parameters){
            //function body
            return statement;
        }
        */
        // NOTHING IS RETURNED FROM THIS FUNCTION
    
    
class Solution {
    public static void main(int[] nums, int target) {
        int i = 0;
        for(int j=i+1 ; j<nums.length;j++){
            if(nums[i]+nums[j]==target){
                System.out.println("[" + i + ", " + j + "]");
            }
             i++;
        }
       
    }
}