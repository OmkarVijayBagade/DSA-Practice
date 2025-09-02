# Pair With Target Sum
# Problem:
# Given a sorted array and a target value, find if there exists a pair whose sum equals the target.
# Example Test Cases:
# Input: arr=[1,2,3,4,6], target=6 → Output: True (2,4)
# Input: arr=[2,5,9,11], target=11 → Output: True (2,9)
# Input: arr=[1,2,3], target=10 → Output: False

def pairSum(lst,target):
    left, right = 0, len(lst)-1
    while left < right: 
        if lst[left] + lst[right] == target:
            return True, (lst[left], lst[right])
        elif lst[left] + lst[right] < target:
            left += 1
        else:
            right -= 1
    return False ,None

print(pairSum([1,2,3,4,5,6,7] , 9))