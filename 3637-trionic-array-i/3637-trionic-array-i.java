class Solution {
    public boolean isTrionic(int[] nums) {
        int length=nums.length;
        int p=-1,q=-1;
        for(int i=1;i<length-1;i++)
        {
            if(nums[i]>=nums[i+1])
            {
                p=i;
                break;
            }
        }

        for(int i=p+1;i<length-1;i++)
        {
            if(nums[i]<=nums[i+1])
            {
                q=i;
                break;
            }
        }

        if(p<=0 || p>=q || q<=length-1) return false;
        return true;




        
    }
}