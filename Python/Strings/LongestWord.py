def longestWord(s:str)->str:
    words = s.split() 
    longest = ""
    for word in words:
        if len(word)>len(longest):
            longest=word
    return longest 

s = "This is programming space"
print(longestWord(s))
