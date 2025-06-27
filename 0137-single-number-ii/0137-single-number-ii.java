class Solution {
    public int singleNumber(int[] nums) {
        Map <Integer,Integer> m1=new HashMap<>();
        Integer a=0;
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
        }

        for(Map.Entry<Integer,Integer> num:m1.entrySet())
        {
            if(num.getValue()==1)
            {
                a=num.getKey();
            }
        }
        return (int) a;
        
    }
}