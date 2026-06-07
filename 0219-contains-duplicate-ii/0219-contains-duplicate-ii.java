class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int len=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<len;i++)
        {
            if(map.containsKey(nums[i]))
            {
                int ind=map.get(nums[i]);
                if((Math.abs(i-ind))<=k)
                return true;
            }
            map.put(nums[i],i);
            
        }

        return false;
    
        
    }
}