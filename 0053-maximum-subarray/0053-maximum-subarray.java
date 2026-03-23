class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0];
        int size=nums.length;
        int max_sum=nums[0];
        //if(size==1) return nums[0];
        for(int i=1;i<size;i++)
        {
            sum=Math.max(nums[i],sum+nums[i]);
            max_sum=Math.max(sum,max_sum);
        }
        return max_sum;
        
    }
}