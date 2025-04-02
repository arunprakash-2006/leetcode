class Solution(object):
    def hammingWeight(self, n):
       binary=bin(n)[2:]
       ans=binary.count('1')
       return ans