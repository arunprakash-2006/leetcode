class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int a=x;
        int sum=0;
        while(a!=0)
        {
            int rem=a%10;
            sum+=rem;
            a/=10;
        }

        if(x%sum==0)
        {
            return sum;
        }

        return -1;
        
    }
}