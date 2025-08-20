class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extra) {
        List<Boolean> l1=new ArrayList<>();
        int max=candies[0];
        for(int i=0;i<candies.length;i++)
        {
            if(max<candies[i])
            {
                max=candies[i];
            }
        }
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]+extra>=max)
            {
                l1.add(true);
            }
            else
            l1.add(false);
        }

        
        return l1;
    }
}