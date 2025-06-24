class Solution {
    public int finalValueAfterOperations(String[] operations) {
         int x=0;
        for(String x1:operations)
        {
            if(x1.equals("--X"))
            {
                x=x-1;
            }
            else if(x1.equals("X++"))
            {
                x=x+1;
            }
            else if(x1.equals("++X"))
            {
                x+=1;
            }
            else
            {
                x-=1;
            }
        }
        return x;
        
    }
}