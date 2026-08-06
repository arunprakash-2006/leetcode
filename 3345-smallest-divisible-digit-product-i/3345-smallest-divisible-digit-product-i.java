class Solution {

    public boolean isdiv(int num,int n)
    {
        int pro=1;
        while(num!=0)
        {
            int dig=num%10;
            pro*=dig;
            num=num/10;
        }
        if(pro%n==0) return true;
        return false;
    }
    public int smallestNumber(int n, int t) {
        for(int i=n;i<=n+10;i++)
        {
            if(isdiv(i,t)) return i;
        }

        return 0;
        
    }
}