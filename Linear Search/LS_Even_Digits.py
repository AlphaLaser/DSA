# Leetcode Problem
# https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

def findNumbers(nums):
    """
    :type nums: List[int]
    :rtype: int
    """

    count = 0

    for i in nums:
        if (len(str(i))) % 2 == 0:
            count += 1

    return count
