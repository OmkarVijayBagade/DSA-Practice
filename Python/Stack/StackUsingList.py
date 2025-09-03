class Stack:
    def __init__(self):
        self.values = []
    
    def push(self,data):
        self.values.append(data)

    def pop(self):
        if not self.values:
            print("Stack is Empty")
            return None 
        return self.values.pop()
    
    def peek(self):
        if not self.values:
            print("Stack is Empty")
            return None 
        return self.values[-1]
    
    def isEmpty(self):
        return len(self.values) == 0
    
s = Stack()

s.push(124)
s.push(1224)
s.push(45624)
s.push(1234224)

print(s.values)

s.pop()
print(s.values)

print(s.peek())
