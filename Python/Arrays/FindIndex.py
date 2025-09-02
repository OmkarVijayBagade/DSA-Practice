# Q: Given an array and a target value, 
# return the index of the target.
#  If it’s not present, return -1.
# Example Test Cases:
# Input: arr = [1, 3, 5, 7], target = 5
# Output: 2

# Input: arr = [10, 20, 30], target = 25
# Output: -1

def findIndex(arr,target):
    for index in range(len(arr)):
        if arr[index] == target:
            return index
    return -1

print(findIndex([1,3,5,7],5))
print(findIndex([10,20,30],25))