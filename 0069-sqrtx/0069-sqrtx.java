class Solution {
    public int mySqrt(int x) {
        int left=1,right=x;
        int ans=0;
        while(left<=right)
        {
            int mid=left+((right-left)/2);

            if(mid<=(x/mid))
            {
                ans=mid;
                left=left+1;
            }
            else
            {
                right=right-1;
            }


        }
        return ans;
        
    }
}