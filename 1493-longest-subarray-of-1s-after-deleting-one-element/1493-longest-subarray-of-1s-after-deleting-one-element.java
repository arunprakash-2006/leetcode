class Solution {
    public int longestSubarray(int[] nums) {
        int left=0;
        int right=0;
        int len=nums.length;
        int zero=0;
        int max_len=Integer.MIN_VALUE;
        while(right<len)
        {
            if(nums[right]==0)
            {
                zero++;
            }

            while(zero>1)
            {
                if(nums[left]==0)
                {
                    zero--;
                }
                left++;
            }

            
            max_len=Math.max(right-left+1,max_len);
            right++;
        }
        return max_len-1;
        
    }
}