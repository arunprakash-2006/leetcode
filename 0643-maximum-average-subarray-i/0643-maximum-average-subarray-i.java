class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int len=nums.length;
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        maxsum=Math.max(maxsum,sum);

        int left=0;
        int right=k;
        while(right<len)
        {
            sum-=nums[left];
            left++;
            sum+=nums[right];
            right++;
            maxsum=Math.max(sum,maxsum);

        }

        return (double) maxsum/k;
        
    }
}