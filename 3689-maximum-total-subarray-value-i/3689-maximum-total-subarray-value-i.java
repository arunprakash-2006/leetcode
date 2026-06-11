class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long min=Long.MAX_VALUE;
        long max=Long.MIN_VALUE;
        for(int i:nums)
        {
            min=Math.min(i,min);
            max=Math.max(i,max);
        }

        return (long)(max-min) *k;

        
    }
}