class Solution:
    def reverseBits(self, n):
        n1 = bin(n)[2:].zfill(32)  
        n2 = n1[::-1]  
        res = int(n2, 2)  
        return res
