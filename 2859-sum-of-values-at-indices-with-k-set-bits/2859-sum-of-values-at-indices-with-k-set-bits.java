class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int c=0;
        int sum=0;
        for(int i=0;i<nums.size();i++)
        {
            int temp=i;
            c=0;
            while(temp>0)
            {
                c+=(temp&1);
                temp>>=1;
            }
            if(c==k)
            {
                sum+=nums.get(i);
            }
        }
        return sum;
        
    }
}