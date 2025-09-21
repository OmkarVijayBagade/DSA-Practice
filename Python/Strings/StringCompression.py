def stringCompression(s:str)->str:
    compressedResult = []
    count = 1
    for i in range(1,len(s)):
        if s[i] == s[i-1]:
            count+=1
        else:
            compressedResult.append(s[i-1]+str(count))
            count = 1
    compressedResult.append(s[-1]+str(count))    #last letter to be added manually 
    compressedString = ''.join(compressedResult)
    if len(compressedString)<len(s):
        return compressedString
    else:
        return s

print(stringCompression("aaabbbcc"))  #expected output: a3b3c2