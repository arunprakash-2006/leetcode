class Solution(object):
    def missingNumber(self, nums):
       length=len(nums)
       sum1=0
       sum2=0
       ans=0
       for i in range(0,length+1):
        sum1+=i
       sum2=sum(nums)
       ans=sum1-sum2
       return ans
         


        

        