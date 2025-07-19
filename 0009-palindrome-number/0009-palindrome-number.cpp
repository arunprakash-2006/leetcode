class Solution {
public:
    bool isPalindrome(int x) {
        long rev,rem;
        long ans=x;
        int flag;
        if(x<0)
        {
            return 0;
        }
        else
        {
            while(x!=0)
            {
                rem=x%10;
                rev=rev*10+rem;
                x=x/10;
            }
        }
        if(rev==ans)
        {
            return 1;
        }
        
return 0;
        
    }
};