class Solution(object):
    def reverse(self, x):
        flag=0
        rem=0
        rev=0
        if x>-2**31 and x<2**31:
            if x<0:
                x=abs(x)
                flag=1
            while x!=0:
                rem=x%10
                rev=rev*10+rem
                x=x//10
            if flag==1:
                rev=-(rev)
            else:
                rev=rev
            if rev < -2**31 or rev > 2**31 :
                return 0
        else:
            return 0
        return rev
        