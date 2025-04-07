class Solution(object):
    def subtractProductAndSum(self, n):
        pro=1
        sum=0
        while n!=0:
            a=n%10
            pro*=a
            sum+=a
            n=n/10
        return pro-sum

        