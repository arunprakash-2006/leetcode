class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length=nums.length;
        Map<Integer,Integer> m1=new HashMap<>();
        for(int i=0;i<length;i++)
        {
            if(m1.containsKey(target-nums[i]))
            {
                return new int[]{i,m1.get(target-nums[i])};
            }
            m1.put(nums[i],i);
        }

        return new int[]{};
        
    }
}