class Solution {
    public int minMoves(int[] nums) {
        int min=nums[0];
        int res=0;
        for(int num:nums)
        {
            if(min>num)
            {
                min=num;
            }
        }

       
        for(int num:nums)
        {
            res+=(num-min);
        }

        return res;

        
    }
}