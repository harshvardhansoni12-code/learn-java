/*
Given two sorted arrays nums1 and nums2, return an array that contains the union of these two arrays. The elements in the union must be in ascending order.
The union of two arrays is an array where all values are distinct and are present in either the first array, the second array, or both.
Example 1:
Input: nums1 = [1, 2, 3, 4, 5], nums2 = [1, 2, 7]
Output: [1, 2, 3, 4, 5, 7]
Explanation:
The elements 1, 2 are common to both, 3, 4, 5 are from nums1 and 7 is from nums2
Example 2:
Input: nums1 = [3, 4, 6, 7, 9, 9], nums2 = [1, 5, 7, 8, 8]
Output: [1, 3, 4, 5, 6, 7, 8, 9]
Explanation:
The element 7 is common to both, 3, 4, 6, 9 are from nums1 and 1, 5, 8 is from nums2
*/ 
import java.util.ArrayList;
public class Union {
    public static void main(String[] args){ 
        int[] nums1= {3, 4, 6, 7, 9, 9};
        int[] nums2= {1, 5, 7, 8, 8};

        // int[] nums1={1, 2, 3, 4, 5};
        // int[] nums2={1, 2, 7};
        int l=nums1.length;
        int m=nums2.length;
        int i=0;
        int j=0;
        ArrayList<Integer> union = new ArrayList<>();
        while(i<l && j<m){
            if(nums1[i]==nums2[j]){
                union.add(nums1[i]);
                i++;
                j++;

            }else{
                if(nums1[i]<nums2[j]){
                    union.add(nums1[i]);
                    i++;
                }else{
                     union.add(nums2[j]);
                    j++;
                }
            }
        }


        for(int k=i; k<l;k++){
            union.add(nums1[k]);
        }

        for(int s=j; s<m; s++){
            union.add(nums2[s]);
        }

        System.out.println(union);
        //Output: [1, 2, 3, 4, 5, 7]
        //Output: [1, 3, 4, 5, 6, 7, 8, 9]
    }
}
