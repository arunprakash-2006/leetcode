class Solution {
    public boolean canAliceWin(int n) {
        if(n<10) return false;
        int rem=10;
        int count=0;
        while(n>=rem)
        {
            n-=rem;
            rem=rem-1;
            count++;
        }

        if(count%2==0) return false;
        return true;


        
    }
}