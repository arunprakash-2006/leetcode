class Solution(object):
    def countBits(self, n):
        ress=[]
        for i in range(n+1):
            ans=bin(i)
            ans1=str(ans)
            res=ans1.count('1')
            ress.append(res)
        return ress
