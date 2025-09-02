# Q: Reverse the given array without using built-in reverse functions.
# Example Test Cases:
# Input: [1, 2, 3, 4, 5]
# Output: [5, 4, 3, 2, 1]

# Input: [10, 20]
# Output: [20, 10]

def reverse(arr):
    start = 0
    end = len(arr) - 1
    while start < end:
        arr[start], arr[end] = arr[end], arr[start] 
        start += 1
        end -= 1
    return arr

print(reverse([1,3,5,7,9]))  
