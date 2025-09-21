def mostFrequentChar(s:str):
    charCount={}
    for char in s:
        if char in charCount:
            charCount[char] += 1
        else:
            charCount[char] = 1
    maxChar = ""
    maxCount=0
    for char,count in charCount.items():
        if count > maxCount:
            maxChar = char 
            maxCount = count
    return maxChar,maxCount

print(mostFrequentChar("hello"))
print(mostFrequentChar("cringe"))