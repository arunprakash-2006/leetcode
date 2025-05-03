class Solution(object):
    def percentageLetter(self, s, letter):
        count=s.count(letter)
        mul=count*100
        ans=mul//len(s)
        return ans
        
        