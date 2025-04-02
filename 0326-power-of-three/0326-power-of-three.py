class Solution(object):
    def isPowerOfThree(self, n):
        flag=1
        for i in range(3,n+1,3):
            if n==i:
                return True
                flag=0
                break
            else:
                continue
        if flag:
            return False
        
            

        