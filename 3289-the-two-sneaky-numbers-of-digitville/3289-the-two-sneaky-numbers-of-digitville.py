class Solution(object):
    def getSneakyNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        seen = set()  # Track seen numbers
        ans = set()   # Track duplicates
        
        for num in nums:
            if num in seen:
                ans.add(num)  # Add to duplicates if already seen
            else:
                seen.add(num)  # Add to seen if it's a new number
        
        return list(ans)  # Convert the set of duplicates to a list
