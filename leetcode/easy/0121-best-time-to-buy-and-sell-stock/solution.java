class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length,min=prices[0],profit=0;
        for(int i=0;i<n;i++){
            min=Math.min(min,prices[i]);
            profit=Math.max(profit,prices[i]-min);
        }
        return profit;
        
    }
}