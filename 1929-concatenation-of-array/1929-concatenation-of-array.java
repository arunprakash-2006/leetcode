class Solution {
    public int[] getConcatenation(int[] nums) {
        int pt=0;
        
        int ans[] =new int[nums.length+nums.length];
        for(int i:nums)
        {
            ans[pt]=i;
            pt++;
        }
        for(int j:nums)
        {
            ans[pt]=j;
            pt++;
        }

       return ans;

    }
}