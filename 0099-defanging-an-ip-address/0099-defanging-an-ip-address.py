class Solution(object):
    def defangIPaddr(self, address):
        str1=""
        for i in address:
            if i=='.':
                str1+='['
                str1+=i
                str1+=']'
            else:
                str1+=i
        return str1
        

