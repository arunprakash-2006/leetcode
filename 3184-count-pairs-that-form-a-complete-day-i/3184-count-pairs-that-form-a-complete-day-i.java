class Solution {
    public int countCompleteDayPairs(int[] hours) {
        int c=0;
        for(int i=0;i<hours.length;i++)
        {
            for(int j=i+1;j<hours.length;j++)
            {
                if(i<j && (hours[i]+hours[j])%24==0)
                {
                    c++;
                }
            }
        }
        return c;
    }
}