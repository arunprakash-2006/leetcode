class Solution {
    public int combinationSum4(int[] nums, int target) {
        int len=nums.length;
        int memo[]=new int[target+1];
        Arrays.fill(memo,-1);
        return rec(nums,target,memo);        
    }

    int rec(int [] nums, int target,int [] memo)
    {
        if(target==0) return 1;
        if(target<0) return 0;
        if(memo[target]!=-1)return memo[target];
        int count=0;
        for(int num:nums)
        {
            count+=rec(nums,target-num,memo);
        }
        
        return memo[target]=count;
    }
}