class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> s1=new HashSet<>();
        for(int i:nums1)
        {
            s1.add(i);
        }
        for(int i:nums2)
        {
            if(s1.contains(i))
            {
                return i;
            }

        }
        return -1;
    
        
    }
}