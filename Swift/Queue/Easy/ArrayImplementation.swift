import Foundation

class QueueArray {
    private var front = -1
    private var rear = -1
    private var size = 0
    private var arr: [Int]
    private let capacity: Int

    init(capacity: Int = 5) {
        self.capacity = capacity
        self.arr = Array(repeating: 0, count: capacity)
    }

    func add(_ val: Int) {
        if rear == capacity - 1 {
            print("Queue is full")
            return
        }
        if front == -1 {  // queue is empty
            front = 0
            rear = 0
            arr[0] = val
        } else {
            rear += 1
            arr[rear] = val
        }
        size += 1
    }

    func remove() -> Int {
        if size == 0 {
            print("Queue is empty")
            return -1
        }
        front += 1
        size -= 1
        return arr[front - 1]
    }

    func peek() -> Int {
        if size == 0 {
            print("Queue is empty")
            return -1
        }
        return arr[front]
    }

    func isEmpty() -> Bool {
        return size == 0
    }

    func display() {
        if size == 0 {
            print("Queue is empty")
        } else {
            for i in front...rear {
                print(arr[i], terminator: " ")
            }
            print()
        }
    }
}

// Testing the Queue
let q = QueueArray()
q.add(1)
q.add(2)
q.add(3)
q.add(4)
q.display()
