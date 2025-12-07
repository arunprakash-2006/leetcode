class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int sum=0;
        int c=0;
        for(int i:nums)
        {
            sum+=i;
            if(sum==0)
            {
                c++;
            }
        }
           
        return c;
        
    }
}