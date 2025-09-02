# Q: Return the second largest element in the array. 
# If not possible, return -1.
# Example Test Cases:
# Input: [12, 35, 1, 10, 34, 1]
# Output: 34

# Input: [10, 10, 10]
# Output: -1

def largestElement(list):
    if len(list) < 2:
        return -1
    
    first = second = float("-inf")

    for num in list:
        if num > first :
            second = first 
            first = num 
        elif num > second and num != first:
            second = num

    if second == float('-inf'):
        return -1  
    return second

print("Second Largest Element:",largestElement([12,35,1,10,34,1]))
