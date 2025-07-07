class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> a1=new ArrayList<>();
        Map<Integer,Integer> m1=new HashMap<>();
        for(int i:nums)
        {
            if(m1.containsKey(i))
            {
                m1.put(i,m1.get(i)+1);
            }
            else
            {
                m1.put(i,1);
            }

            if (m1.get(i) == 2) {
                a1.add(i);
            }
        }
        return a1;

        
    }
}