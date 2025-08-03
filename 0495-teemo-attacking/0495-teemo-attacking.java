class Solution {
    public int findPoisonedDuration(int[] time, int duration) {
        int sum=0;
        for(int i=0;i<time.length-1;i++)
        {
          
                if(Math.abs(time[i]-time[i+1])>duration)
                {
                    sum+=duration;
                }
                else
                {
                    sum+=(time[i+1]-time[i]);
                }
        }
        sum+=duration;

        return sum;
    }
}