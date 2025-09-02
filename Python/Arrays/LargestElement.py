#  Q: Given an array of integers, return the largest element.
# Example Test Cases:
# Input: [3, 7, 2, 9, 5]
# Output: 9

# Input: [-1, -5, -3]
# Output: -1

def findLargestElement(arr):
    #edge case: empty array
    if not arr:
        return None

    largest = arr[0]

    for num in arr:
        if num > largest:
            largest = num
    return largest

print(findLargestElement([3, 7, 2, 9, 5]))   
print(findLargestElement([]))
print(findLargestElement([-1, -5, -3])) 
print(findLargestElement([10]))