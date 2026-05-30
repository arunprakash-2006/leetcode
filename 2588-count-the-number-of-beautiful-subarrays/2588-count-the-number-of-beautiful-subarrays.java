class Solution {
    public long beautifulSubarrays(int[] nums) {
        long prexor=0;
        long count=0;
        Map<Long,Long> map=new HashMap<>();
        map.put(0L,1L);
        for(int num:nums)
        {
            prexor^=num;
            count+=map.getOrDefault(prexor,0L);
            map.put(prexor,map.getOrDefault(prexor,0L)+1);
        }

        return count;

        
    }
}