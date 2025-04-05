class Solution(object):
    def countPartitions(self, nums):
        flag = 0
        
        for i in range(1, len(nums)):  # Only go up to len(nums) - 1
            left = 0
            right = 0
            
            # Compute sum of left part
            for j in range(0, i):
                left += nums[j]
            
            # Compute sum of right part
            for k in range(i, len(nums)):
                right += nums[k]
            
            ans = abs(left - right)
            if ans % 2 == 0:
                flag += 1
        
        return flag
