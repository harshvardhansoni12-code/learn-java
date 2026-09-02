public class LinearSearch {
    public static void main(String[] args){
        int[] asd = {1,2,3,4,5,6,7,8};
        int sd = 2;
        int result = LinearSearchInArr(asd,sd);
        System.out.println(result);
    }

    static int LinearSearchInArr(int[] arr, int target){
        if(arr.length ==0){
            return -1;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                System.out.println("Target found at index: " + i);
                return i;
            }
        }
        return -1;
    }
}
