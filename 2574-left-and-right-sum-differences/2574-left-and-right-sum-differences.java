class Solution {
     public int[] leftRightDifference(int[] nums) {
        int len=nums.length;
        int lsum[]=new int[len];
        int rsum[]=new int[len];
        lsum[0]=0;
        rsum[len-1]=0;
        int sum1=0,sum2=0;
        for(int i=0;i<nums.length-1;i++)
        {
            sum1+=nums[i];
            sum2+=nums[len-i-1];
            lsum[i+1]=sum1;
            rsum[len-i-2]=sum2;
        }

        for(int i=0;i<len;i++)
        {
            nums[i]=Math.abs(lsum[i]-rsum[i]);
        }

        return nums;
        
    }
}