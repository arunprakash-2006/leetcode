class Solution {
    public int maxProfit(int[] prices) {
        int len=prices.length;
        int max_prof=0;
        int val=prices[0];
        int cost;
        for(int i=1;i<len;i++)
        {
            cost=prices[i]-val;
            max_prof=Math.max(max_prof,cost);
            val=Math.min(prices[i],val);
        }

        return max_prof;

        
    }
}