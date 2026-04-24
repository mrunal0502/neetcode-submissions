class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int n = prices.length;
        // for(int i=0; i<n-1; i++){
        //     for(int j=i+1; j<n ; j++){
        //        profit = Math.max(profit, prices[j]-prices[i]);
        //     }
        // }

        // return profit;
         int buy = prices[0];
        for(int i =1; i<n; i++){
            if(prices[i]-buy>0){
                profit = Math.max(profit, prices[i]-buy);
            }else{
                buy = prices[i];
            }
        }

        return profit;
    }
}
