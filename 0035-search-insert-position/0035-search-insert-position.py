class Solution(object):
    def searchInsert(self, nums, target):
        r = len(nums)
        for i in range(r):
            if nums[i] >= target:
                return i
        return r 