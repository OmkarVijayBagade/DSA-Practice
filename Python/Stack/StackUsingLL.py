#Node Structure
class Node :
    def __init__(self,data):
        self.data = data 
        self.next = None

#Stack 
class Stack: 
    def __init__(self):
        self.top = None 
    
    def isEmpty(self):
        return self.top is None  #self.top == None
    
    def addElement(self, data):
        newNode = Node(data)  #new node object from Node class 
        newNode.next = self.top 
        self.top = newNode

    def printElements(self):
        current = self.top 
        while current:
            print(current.data)
            current = current.next
    
    def pop(self):
        if self.top is None:
            print("Stack is Empty")
        else:
            value = self.top.data
            self.top = self.top.next
            return value 
    
    def peek(self):
        print( self.top.data )

    
#creation of object from class Stack
stack = Stack()

