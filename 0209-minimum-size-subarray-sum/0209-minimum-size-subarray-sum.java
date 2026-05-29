class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int left=0;
        int min_size=Integer.MAX_VALUE;
        for(int right=0;right<nums.length;right++)
        {
            sum+=nums[right];
            while(sum>=target)
            {
                min_size=Math.min(min_size,right-left+1);
                sum-=nums[left];
                left++;
            }
        }

        return min_size==Integer.MAX_VALUE ? 0:min_size;


        
    }
}