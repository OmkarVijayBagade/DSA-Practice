# Q: Determine if the given array is sorted in non-decreasing order.
# Example Test Cases:
# Input: [1, 2, 2, 3, 4]
# Output: True

# Input: [3, 1, 2]
# Output: False

def sortedOrNot(array):
    for i in range(1,len(array)):
        if array[i] < array[i-1]:
            return False 
    return True   

print(sortedOrNot([1,2,3]))
print(sortedOrNot([1,3,2]))