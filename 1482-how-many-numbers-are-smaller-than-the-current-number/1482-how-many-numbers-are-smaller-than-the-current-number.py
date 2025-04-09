class Solution(object):
    def smallerNumbersThanCurrent(self, nums):
        count=0
        lst=[]
        for i in nums:
            count=0
            for j in nums:
                if i>j:
                    count+=1
                
            lst.append(count)
        return lst

        