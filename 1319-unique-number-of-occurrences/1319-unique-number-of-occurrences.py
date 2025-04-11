class Solution(object):
    def uniqueOccurrences(self, arr):
        lst = []
        unique_elements = set(arr)

        for i in unique_elements:
            count = arr.count(i)
            lst.append(count)

        return len(lst) == len(set(lst))
