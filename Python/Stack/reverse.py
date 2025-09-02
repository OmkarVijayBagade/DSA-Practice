from StackUsingLL import Stack

def reverseString(string):
    stack = Stack()
    
    #adding elements in the stack 
    for characters in string:
        stack.addElement(characters)

    reversedString = ""

    while not stack.isEmpty():
        reversedString += stack.pop()

    return reversedString

print(reverseString("hello"))