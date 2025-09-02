from StackUsingLL import Stack

def isPalindrome(string):
    stack = Stack()

    #1 adding all the characters in the stack 
    for ch in string: 
        stack.addElement(ch)

    #2 pop to create reversedString 
    reversedString = ""

    while not stack.isEmpty(): 
        reversedString += stack.pop()
        
    #comparing the reversed string to original for palindrome
    return string == reversedString

print(isPalindrome("coc"))
print(isPalindrome("create"))
