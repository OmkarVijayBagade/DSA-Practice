class Node {
    var data: Int
    var next: Node?

    init(_ data: Int) {
        self.data = data
        self.next = nil
    }
}

var head: Node? = nil

// Insert at end
func insert(_ value: Int) {
    let newNode = Node(value)
    if head == nil {
        head = newNode
        return
    }
    var temp = head
    while temp?.next != nil {
        temp = temp?.next
    }
    temp?.next = newNode
}

// Display the list
func display() {
    var temp = head
    while temp != nil {
        print("\(temp!.data) -> ", terminator: "")
        temp = temp?.next
    }
    print("nil")
}

// Search a value
func search(_ key: Int) -> Bool {
    var temp = head
    while temp != nil {
        if temp!.data == key {
            return true
        }
        temp = temp?.next
    }
    return false
}

// Delete a node by value
func delete(_ key: Int) {
    if head == nil { return }

    if head!.data == key {
        head = head?.next
        return
    }

    var temp = head
    while temp?.next != nil && temp?.next?.data != key {
        temp = temp?.next
    }

    if temp?.next != nil {
        temp?.next = temp?.next?.next
    }
}

// Main simulation
insert(10)
insert(20)
insert(30)
insert(40)

display()  // 10 -> 20 -> 30 -> 40 -> nil

delete(20)
display()  // 10 -> 30 -> 40 -> nil

print("Search 30:", search(30))  // true
print("Search 99:", search(99))  // false
