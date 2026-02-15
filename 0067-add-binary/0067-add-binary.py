class Solution(object):
    def addBinary(self, a, b):
       b1=int(a,2)
       b2=int(b,2)
       ans=b1+b2
       return bin(ans)[2:]
        
        