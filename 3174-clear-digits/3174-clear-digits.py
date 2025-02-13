class Solution(object):
    def clearDigits(self, s):
        stack=[]
        ans=""
        for i in s:
            if i.isdigit():
                if stack:
                    stack.pop()
            else:
                stack.append(i)
        for j in stack:
            ans+=j
        return ans
            