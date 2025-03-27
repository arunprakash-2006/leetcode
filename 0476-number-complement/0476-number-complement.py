class Solution(object):
    def findComplement(self, num):
        binary=bin(num)[2:]
        comp=""
        for i in binary:
            if i=='0':
                comp+="1"
            else:
                comp+="0"
        result=int(comp,2)
        return result
