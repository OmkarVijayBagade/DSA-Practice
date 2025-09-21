# Find all the permutations of given string 
# Write a python program that returns all possible 
# permutations of given string.
# Avoid using the itertools provided in python. 
# permutations()and instead implement you own logic.

def findPermutations(s: str):
    # base case     
    if len(s) ==1 :
        return [s]
    permutations =[]
    for i in range(len(s)):
        curr_char = s[i]  #picking the characters from the string 
        remaining_char = s[:i] + s[i+1:]  #slicing the string s
        remainingPermutations = findPermutations(remaining_char)
        for p in remainingPermutations:
            permutations.append(curr_char + p)
    return permutations        

print(findPermutations('abc'))   #expected output: ['abc','acb','bac','bca','cab','cba']


