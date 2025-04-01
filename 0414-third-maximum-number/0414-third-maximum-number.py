class Solution(object):
    def thirdMax(self, nums):
        ans1=set(nums)
        ans2=list(ans1)
        ans2.sort(reverse=True)
        if len(ans2)<3:
            return ans2[0]
        else:
            return ans2[2]

        