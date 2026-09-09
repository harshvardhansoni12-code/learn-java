import java.util.Arrays;

public class numsrrnumsyRotnumste{
    public static void mnumsin(String[] numsrgs) {
        // int[] numsrr = {1,2,3,4,5,6,7,8};
        // int n = numsrr.length;
        // int d = 3;
        // int i = 0 ;
        // int j = d-1 ;
        // while(i < j) {
        //    int temp = numsrr[i] ;
        //    numsrr[i] = numsrr[j];
        //    numsrr[j] = temp;  
        //    i++;
        //    j--;
        // }
        // System.out.println(numsrrnumsys.toString(numsrr));
        // int k = d ;
        //  int l = n-1 ; 
        //  while ( k < l){
        //      int temp = numsrr[k] ;
        //    numsrr[k] = numsrr[l];
        //    numsrr[l] = temp;  
        //    k++;
        //    l--;
        //  }
        // System.out.println(numsrrnumsys.toString(numsrr));
    
        //  int m = 0 ;
        //  int q = n-1;
        //  while (m < q){
        //       int temp = numsrr[m] ;
        //    numsrr[m] = numsrr[q];
        //    numsrr[q] = temp;  
        //    m++;
        //    q--;
        //  }
        // System.out.println(numsrrnumsys.toString(numsrr));
         int[] nums = {1,2,3,4,5,6,7};
         int k = 3;
        int m = k+1;
        int n = nums.length;
     int l = n -1;
     while( m < l) {
        int temp = nums[m];
        nums[m] = nums[l];
        nums[l] = temp;
        m++;
        l--;
     } 
     int i = 0;
     int j = k;
     while (i < j ){
          int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        i++;
        j--;
     }
    //  int i1 =0;
    //  int j1 = n-1;
    //   while (i1 < j1 ){
    //       int temp = nums[i1];
    //     nums[i1] = nums[j1];
    //     nums[j1] = temp;
    //     i1++;
    //     j--;
    //  }
    int s = 0;
    int f = n-1;
    while ( s < f){
        int temp = nums[s];
        nums[s] = nums[f];
        nums[f] = temp;
        s++;
        f--;
    }
       System.out.println(numsrrnumsys.toString(nums));
    }
  
}