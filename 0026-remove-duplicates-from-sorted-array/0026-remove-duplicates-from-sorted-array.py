class Solution:
    def removeDuplicates(self, nums):
        if not nums:
            return 0  # Handle edge case for an empty array
        
        i = 0  # Pointer for the position of the last unique element
        
        for j in range(1, len(nums)):
            if nums[j] != nums[i]:  # Found a new unique element
                i += 1
                nums[i] = nums[j]  # Move the unique element to the next position
        
        return i + 1  # Number of unique elements
