class Solution(object):
    def countSeniors(self, details):
        count=0
        for i in range(0,len(details)):
            age=details[i][11:13]
            age=int(age)
            if age>60:
                count+=1
        return count