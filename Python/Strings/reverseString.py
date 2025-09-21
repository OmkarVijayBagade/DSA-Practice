
# def reverse(s: str)->str:
#     reversedString = ''
#     for char in s:
#         reversedString = char+reversedString
#     return reversedString
# print(reverse('hello'))


#string slicing 
def reverse_string(s: str) -> str:
    return s[::-1]
string = 'hello'
print(reverse_string(string))




