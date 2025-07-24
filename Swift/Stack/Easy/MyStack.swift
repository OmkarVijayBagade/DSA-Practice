class MyStack{
    private var stack: [Int]
    private var capacity: Int

    init(size: Int) {
        stack = []
        capacity = size
    }

    func push(_ x: Int){
        if stack.count == capacity {
            print("Stack Overflow!")
            return
        }
        stack.append(x)
    }

    func pop() -> Int?{
        if stack.isEmpty{
            print("Stack Underflow!")
            return nil
        }
        return stack.removeLast()
    }

    func peek() -> Int?{
        return stack.last
    }

    func isEmpty() -> Bool{
        return stack.isEmpty
    }
}

// Test
let stack = MyStack(size: 5)
stack.push(10)
stack.push(20)
stack.push(30)
print("Top: \(stack.peek() ?? -1)") // 30
print("Popped: \(stack.pop() ?? -1)") // 30
print("Top after pop: \(stack.peek() ?? -1)") // 20