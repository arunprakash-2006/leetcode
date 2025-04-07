class Solution(object):
    def findNumbers(self, nums):
        count=0
        for i in nums:
            c=str(i)
            if len(c)%2==0:
                count+=1
        return count