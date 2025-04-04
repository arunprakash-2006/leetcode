class Solution(object):
    def nextGreaterElement(self, nums1, nums2):
        ans = []
        for i in nums1:
            greater = -1
            found = False
            for j in range(len(nums2)):
                if nums2[j] == i:
                    found = True  
                elif found and nums2[j] > i:
                    greater = nums2[j]
                    break  
            ans.append(greater)
        return ans
