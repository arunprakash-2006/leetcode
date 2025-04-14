class Solution(object):
    def transpose(self, matrix):
        lst = []
        for j in range(len(matrix[0])):      
            lst1 = []
            for i in range(len(matrix)):     
                lst1.append(matrix[i][j])
            lst.append(lst1)
        return lst
