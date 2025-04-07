class Solution(object):
    def generateTheString(self, n):
        str1="ab"
        res=""
        if n%2==0:
            c=n-1
            for i in range(c):
                res+=str1[0]
            res+=str1[1]
        else:
            for i in range(n):
                res+=str1[0]
    
            
        return res