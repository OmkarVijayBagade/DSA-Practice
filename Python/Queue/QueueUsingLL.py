#structure of Node 
class Node:
    def __init__(self,data):
        self.data = data 
        self.next = None

#structure of Queue
class Queue:
    def __init__(self):
        self.front = None #points in first element
        self.rear = None  #points in last element
    
    def isEmpty(self):
        return self.front is None 
    
    def enqueue(self, data):
        newNode = Node(data)
        if self.rear is None:  #is empty then -> 
            self.front = self.rear = newNode
        else:
            self.rear.next = newNode
            self.rear = newNode

    def dequeue(self):
        if self.isEmpty():
            print("Queue is Empty")
            return None
        value = self.front.data
        self.front = self.front.next
        if self.front is None:  # if queue becomes empty
            self.rear = None
        return value
    
    def printElements(self):
        current = self.front
        while current:
            print(current.data)
            current = current.next

    def peek(self):
        if self.isEmpty():
            print("Queue is Empty")
        else:
            print(self.front.data)

    
# Creation of object from Queue class
queue = Queue()

# queue.enqueue(10)
# queue.enqueue(20)
# queue.enqueue(30)
# queue.printElements()  # 10 20 30
# print("Dequeued:", queue.dequeue())  # 10
# queue.printElements()  # 20 30
# queue.peek()   



