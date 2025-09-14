# Find the first non-repeating character in a string

def first_non_repeating_character(string):
    count = {}
    for char in string:
        count[char] = count.get(char, 0 ) +1 
    for char in string:
        if count[char] == 1:
            return char 
    return None 

print(first_non_repeating_character('aabbcddee'))
