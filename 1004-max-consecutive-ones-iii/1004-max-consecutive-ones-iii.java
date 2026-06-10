class Solution {
    public int longestOnes(int[] nums, int k) {
        int len=nums.length;
        int zero_count=0;
        int left=0;
        int max_len=Integer.MIN_VALUE;
        for(int i=0;i<len;i++)
        {
            if(nums[i]==0)
            {
                zero_count++;
            }
            while(zero_count>k)
            {
                if(nums[left]==0)
                {
                    zero_count--;
                }
                left++;
            }
            max_len=Math.max(i-left+1,max_len);

        }
        return max_len;
    }
}