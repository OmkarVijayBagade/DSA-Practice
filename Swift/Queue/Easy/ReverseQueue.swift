import Foundation

// Reverse Queue using Stack
func reverseQueueUsingStack(_ queue: inout [Int]) {
    var stack: [Int] = []

    // Move all elements from queue to stack
    while !queue.isEmpty {
        stack.append(queue.removeFirst())
    }

    // Pop from stack and add back to queue
    while !stack.isEmpty {
        queue.append(stack.removeLast())
    }
}

// Reverse Queue using Recursion
func reverseQueueUsingRecursion(_ queue: inout [Int]) {
    if queue.isEmpty {
        return
    }

    // Remove first element
    let front = queue.removeFirst()

    // Recursive call
    reverseQueueUsingRecursion(&queue)

    // Add removed element at the end
    queue.append(front)
}

// Testing
var queue = [10, 20, 30, 40]
print("Original Queue: \(queue)")

reverseQueueUsingStack(&queue)
print("Reversed Queue using stack: \(queue)")

// Uncomment this and comment above reverse to test recursion
// reverseQueueUsingRecursion(&queue)
// print("Reversed Queue using recursion: \(queue)")
