class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int minAmount=prices[0];

        for(int i=1;i<prices.length;i++){
           int profit=prices[i]-minAmount;
            max=Math.max(max,profit);
            minAmount=Math.min(minAmount,prices[i]);
        }
        return max;
    }
}