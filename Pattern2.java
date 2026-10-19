public class Pattern2 {
    public static void main(String[] args){
      class Solution {
    /**
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
          int buy = 0;
        int profit =0;
        int newprofit=0;
        for(int j=0; j<prices.length; j++){
            if(prices[j] < buy){
                buy= prices[j];
            }
            else{
                newprofit = prices[j] - buy;
                if(newprofit > profit){
                    profit=newprofit;
                }
                if(profit > 0){
                    return profit;
                }else{
                    return 0;
                }
            }
        }

}
      }}


/* Pattern 2 */