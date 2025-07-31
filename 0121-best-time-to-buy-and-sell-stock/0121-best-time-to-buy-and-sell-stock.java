class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int pric = prices[0];
        int profit = 0;
        for(int i = 0; i<n;i++){
            if(pric > prices[i]){
                pric = prices[i];
            }
            else{
            int cost = prices[i] -pric;
            profit = Math.max(cost,profit);
            }
        }
        return profit;
    }
}