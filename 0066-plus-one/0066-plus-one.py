class Solution(object):
    def plusOne(self, digits):
        sum=0
        ans=[]
        for i in digits:
            sum=sum*10+i
        sum=sum+1
        sum=str(sum)
        for i in sum:
            c=int(i)
            ans.append(c)
        return ans

        
        
       
        