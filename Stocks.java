public class Stocks{
    public static void main(String[] args){
        int[] nums = {7,1,5,3,6,4};
        int min = Integer.MAX_VALUE;
        int posbuy=0;
        int possell=0;
        int profit = 0;
        int calculatedProfit = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] < min){
                min = nums[i];
                posbuy = i;
            }
                
        }
        for(int j=posbuy; j<nums.length;j++){
            if(nums[j] > min){
                calculatedProfit = nums[j] - min;
                if(calculatedProfit > profit){
                    profit = calculatedProfit;
                    possell = j;
                }
            }
        }
        System.out.println("Buy at: " + posbuy + " Sell at: " + possell);
    }
}