class Solution(object):
    def reverseVowels(self, s):
        lst=[]
        ans=""
        for i in s:
            if i in 'aAeEiIoOuU':
                lst.append(i)
        length=(len(lst)-1)
        for i in s:
                if i in 'aAeEiIoOuU':
                    ans+=lst[length]
                    length-=1
                else:
                    ans+=i
        return ans

            
