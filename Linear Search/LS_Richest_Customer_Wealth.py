# Leetcode Problem - Richest Customer Wealth
# https://leetcode.com/problems/richest-customer-wealth/


def maximumWealth(accounts):
    """
    :type accounts: List[List[int]]
    :rtype: int
    """

    def sum(arr):
        sum = 0
        for i in arr:
            sum += i

        return sum

    all_num = []

    for i in accounts:
        all_num.append(sum(i))

    final_ans = 0

    for i in all_num:
        if i > final_ans:
            final_ans = i

    return final_ans

