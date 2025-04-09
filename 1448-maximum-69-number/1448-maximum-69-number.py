class Solution(object):
    def maximum69Number (self, num):
        num1=list(str(num))
        for i in range(len(num1)):
            if num1[i]=='6':
                num1[i]='9'
                break
        str1=""
        for i in num1:
            str1+=i
        return int(str1)

        