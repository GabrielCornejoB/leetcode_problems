class Solution(object):
    def minPartitions(self, n):
        """
        :type n: str
        :rtype: int
        """
        numbers = [num for num in n]
        numbers.sort()
        return numbers[-1]
