from typing import List 
'''
this is a module used for type definition in python to practice 
type casting and data type of variables whenever possible.
'''

def two_sum(nums: List[int], target: int) -> List[int]:
    for i in range(len(nums)):
        for j in range(i+1, len(nums)):
            if nums[i] + nums[j] == target:
                return [i,j]
    return []

# print(two_sum([1,3,5,7], 6))
nums = [2, 7, 11, 15]
target = 17
print(two_sum(nums, target)) 