class Solution {
    public int maxProduct(int[] nums) {
        int len=nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len;j++)
            {
                if(i!=j)
                {
                    if((nums[i]-1) *(nums[j]-1) >max)
                    {
                        max=(nums[i]-1) *(nums[j]-1);
                    }
                }
            }
        }
        return max;
    }
}