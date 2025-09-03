from QueueUsingLL import Queue

queue = Queue()

queue.enqueue(10)
queue.enqueue(20)
queue.enqueue(30)
queue.printElements()  
print("Dequeued:", queue.dequeue())  
queue.printElements()  
queue.peek()   