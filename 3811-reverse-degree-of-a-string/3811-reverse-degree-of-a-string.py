class Solution(object):
    def reverseDegree(self, s):
        str1="abcdefghijklmnopqrstuvwxyz"
        lst1=[]
        leng=1
        deg=0
        for i in range(26,0,-1):
            lst1.append(i)
        for i in s:
            ind=str1.index(i)
            ans=leng*lst1[ind]
            deg+=ans
            leng+=1
        return deg


