# 5. Count Occurrences of an Element
# Q: Given an array and a number x, count how many times x appears in the array.
# Example Test Cases:
# Input: arr = [1, 2, 2, 3, 2, 4], x = 2
# Output: 3

# Input: arr = [5, 5, 5, 5], x = 5
# Output: 4

def countOccurrences(lst, target):
    count = 0 
    for num in lst:
        if num == target:
            count += 1
    return count 

print(countOccurrences([1,2,2,3,2,4], 2))
print(countOccurrences([5,5,5,5],5))
print(countOccurrences([],2))