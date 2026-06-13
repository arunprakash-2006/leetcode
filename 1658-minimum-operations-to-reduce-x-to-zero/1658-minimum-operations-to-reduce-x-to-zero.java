class Solution {
    public int minOperations(int[] nums, int x) {
        int len=nums.length;
        int tot_sum=0;
        for(int i=0;i<len;i++)
        {
            tot_sum+=nums[i];
        }
        int max_len=-1;
        int target=tot_sum-x;
        if(target==0) return len;
        if(target<0) return -1;
        int left=0;
        int cur_sum=0;
        for(int right=0;right<len;right++)
        {
            cur_sum+=nums[right];
            while(cur_sum>target)
            {
                cur_sum-=nums[left];
                left++;
            }

            if(cur_sum==target)
            {
                max_len=Math.max(max_len,right-left+1);
            }

        }

        if(max_len==-1) return -1;
        return len-max_len;

        
    }
}