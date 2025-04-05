class Solution(object):
    def reversePrefix(self, word, ch):
        str1=""
        if ch not in word:
            return word
        else:
            for i in word:
                str1+=i
                if i==ch:
                    break
                
            
            length=len(str1)
            str1=str1[::-1]
            str2=word[length:]
        return str1+str2

        