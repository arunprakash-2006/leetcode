class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int c=0,c1=0;
        
        for(int i:nums1)
        {
            for(int j:nums2)
            {
                if(i==j)
                {
                    c++;
                    break;
                }
            }
        }
        
         for(int i:nums2)
            {
                 for(int j:nums1)
                 {
                    if(j==i)
                    {
                        c1++;
                        break;
                    }
                 }
                 

            }
            return new int[] {c,c1};
    }
}

        
                

        
        
