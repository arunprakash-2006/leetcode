class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxi=0;
        int count=0;
        int len=nums.length;
        if(len==1 && nums[0]==0) return 0;
        if(len==1 && nums[0]==1) return 1;
        for(int i:nums)
        {
            if(i==1)
            {
                count+=1;
                if(count>maxi)
                {
                    maxi=count;
                }
                
            }
            else
                {
                    count=0;
                }
        }

        return maxi ;


        
    }
}