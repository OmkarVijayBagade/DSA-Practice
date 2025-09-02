from StackUsingLL import Stack 

stack = Stack()

#accessing the functions from the class Stack
stack.addElement(12)
stack.addElement(15)
stack.addElement(19)
stack.addElement(23)

stack.printElements()
print("\nafter pop function ")
stack.pop()

stack.printElements()
print("\nafter peek function ")

stack.peek()

stack.isEmpty()