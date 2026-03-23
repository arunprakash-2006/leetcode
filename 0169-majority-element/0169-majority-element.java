class Solution {
    public int majorityElement(int[] nums) {
        int len=nums.length;
        int can=-1;
        int votes=0;
        for(int i:nums)
        {
            if(votes==0)
            {
                can=i;
                votes=1;
            }
            else if(can==i)
            {
                votes++;
            }
            else votes--;
        }

        return can;
        
    }
}