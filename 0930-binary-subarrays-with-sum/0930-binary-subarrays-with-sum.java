class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int pref=0;
        int count=0;
        Map<Integer,Integer> m1=new HashMap<>();
        m1.put(0,1);
        for(int i:nums)
        {
            pref+=i;
            count+=m1.getOrDefault(pref-goal,0);
            m1.put(pref,m1.getOrDefault(pref,0)+1);
        }

        return count;
    }
}