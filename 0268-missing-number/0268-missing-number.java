class Solution {
    public int missingNumber(int[] nums) {
        int len=nums.length;
        int xor=0;
        int xor1=0;
        for(int i=0;i<=len;i++)
        {
            xor=xor^i;
        }

        for(int i=0;i<len;i++)
        {
            xor1=xor1^nums[i];
        }

        return (xor^xor1);
        
    }
}