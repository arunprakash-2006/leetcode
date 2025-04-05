class Solution(object):
    def reverseOnlyLetters(self, s):
        lst=[]
        str1=""
        for i in s:
            if i.isalpha():
                lst.append(i)
        lst.reverse()
        leng=0
        for i in s:
            if i.isalpha():
                str1+=lst[leng]
                leng+=1
            else:
                str1+=i
        return str1



        
        