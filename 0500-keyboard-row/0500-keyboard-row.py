class Solution(object):
    def findWords(self, words):
        ans=[]
        row1 = set("qwertyuiop")
        row2 = set("asdfghjkl")
        row3 = set("zxcvbnm")
        for i in words:
            if set(i.lower()).issubset(row1) or set(i.lower()).issubset(row2) or set(i.lower()).issubset(row3):
                ans.append(i)
        return ans

        