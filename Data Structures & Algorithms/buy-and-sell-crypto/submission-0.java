class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int profit = 0;

        for(int i = 0; i < prices.length; i++){
            int potentialProfit = prices[i] - minPrice;
            if(potentialProfit > profit){
                profit = potentialProfit;
            }

            if(minPrice > prices[i]){
                minPrice = prices[i];
            }
        }
        return profit;
    }
}
