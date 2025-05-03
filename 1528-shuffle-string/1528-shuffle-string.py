class Solution(object):
    def restoreString(self, s, indices):
        ans=""
        for i in indices:
            ans+=s[i]
        return ans
        