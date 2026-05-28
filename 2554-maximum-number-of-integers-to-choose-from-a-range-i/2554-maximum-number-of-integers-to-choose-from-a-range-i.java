class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> set=new HashSet<>();
        int sum=0;
        int count=0;
        for(int i:banned)
        {
            if(i<=n)
            {
                set.add(i);
            }
        }

        for(int i=1;i<=n;i++)
        {
            if(!set.contains(i))
            {
                
                sum+=i;
                //System.out.print(sum+" ");
                if(sum<=maxSum)
                {
                    count++;
                }
    
            }
        }

        return count;
        
    }
}