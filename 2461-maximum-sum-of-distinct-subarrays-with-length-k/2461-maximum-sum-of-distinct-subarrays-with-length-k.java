class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int len=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        long max_sum=0;
        long curr_sum=0;
        for(int i=0;i<k;i++)
        {
            curr_sum+=nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        if(map.size()==k)
        max_sum=Math.max(max_sum,curr_sum);
        int left=0;
        for(int right=k;right<len;right++)
        {
            curr_sum-=nums[left];
            map.put(nums[left],map.get(nums[left])-1);
            if(map.get(nums[left])==0)
            {
                map.remove(nums[left]);
            }
            curr_sum+=nums[right];
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            if(map.size()==k)
            {
                max_sum=Math.max(max_sum,curr_sum);
            }
            left++;
        }

        return max_sum;
        
        
    }
}