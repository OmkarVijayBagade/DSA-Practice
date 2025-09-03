class Queue:
    def __init__(self):
        self.values = []
    
    def enqueue(self,x):
        self.values.append(x)
    
    def dequeue(self):
        front = self.values[0]
        self.values = self.values[1: ]
        return front 
    
queue = Queue()

queue.enqueue(13)
queue.enqueue(43)

print(queue.values)

queue.dequeue()
print(queue.values)