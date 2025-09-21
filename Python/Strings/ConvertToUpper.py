def to_uppercase(string:str)->str:
    result = ""
    for char in string:
        if 'a' <= char <= 'z':
            result += chr(ord(char)-32)  # ord() method is used to find the ascii value of the char
        else:
            result += char 
    return result 
str = 'hEllo'
print(to_uppercase(str))
        
