from collections import Counter

class Solution(object):
    def intersect(self, nums1, nums2):
        ans = []
        count = Counter(nums1)  # Count occurrences in nums1

        for num in nums2:
            if count[num] > 0:  # If the number exists in nums1
                ans.append(num)
                count[num] -= 1  # Reduce count to avoid duplicate matches

        return ans

