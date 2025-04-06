class Solution(object):
    def maximizeSum(self, nums, k):
        sum=0
        nums.sort()
        for i in range(0,k):
            a=nums[len(nums)-1]
            sum=sum+a
            nums[len(nums)-1]=nums[len(nums)-1]+1
        return sum
            




        
        