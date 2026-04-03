class Solution {
    public long countBadPairs(int[] nums) {
        int len=nums.length;
        long count_good_pairs=0;
        Map<Long,Long> map=new HashMap<>();
        long val=0;
        for(int i=0;i<len;i++)
        {
            val=(long)nums[i]-i;
            if(map.containsKey(val))
            {
                count_good_pairs+=map.get(val);
                map.put(val,map.get(val)+1);
            }
            if(!map.containsKey(val))
            {
                map.put(val,(long)1);
            }
            
        }

        long total_pairs=(long) len*(len-1)/2;
        return total_pairs-count_good_pairs;

        

        
    }
}