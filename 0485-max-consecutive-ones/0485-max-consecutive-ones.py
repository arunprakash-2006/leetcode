class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        nums1=[]
        nums2=[]
        count=0
        for i in nums:
            nums1.append(i)
        for i in range(len(nums1)):
            if nums1[i]==0:
                nums2.append(count)
                count=0
            else:
                count+=1
        nums2.append(count)
        return max(nums2)
           
        
        

            