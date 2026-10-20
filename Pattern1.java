import java.util.Arrays;
public class Pattern1
{
    public static void main(String[] args)
    {
        int[] arr = {1,1,2,2,2,3,3};
        int[] sarr = new int[3];
        int j =0;
        for( int i = 0; i< arr.length-1; i++){
            if(i == 0){
                sarr[j++] = arr[i];
            }
            else{
           if(arr[i] != arr[i-1]){
               sarr[j++] = arr[i];
           }
        }
}
 System.out.println(Arrays.toString(sarr));
}

}