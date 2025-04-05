class Solution(object):
    def countPartitions(self, nums):
        flag=0
        
        for i in range(1,len(nums)):
            left=0
            right=0
            for j in range(0,i):
                left+=nums[j]
            for k in range(i,len(nums)):
                right+=nums[k]
            ans=abs(left-right)
            if ans%2==0:
                flag+=1
        return flag
        

           