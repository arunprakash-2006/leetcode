class Solution(object):
    def minElement(self, nums):
        lst=[]
        rem=0
        mini=0
        sum=0
        for i in range(0,len(nums)):
            if nums[i]<10:
                lst.append(nums[i])
            else:
                while nums[i]!=0:
                
                    rem=nums[i]%10
                    sum+=rem
                    nums[i]/=10
                lst.append(sum)
                sum=0
        mini=min(lst)
        return mini
        