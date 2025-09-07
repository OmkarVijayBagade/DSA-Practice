class Node {
    var data: Int
    var next: Node?

    init(_ data: Int) {
        self.data = data
        self.next = nil
    }
}

let node1 = Node(1)
let node2 = Node(20)
let node3 = Node(3)

// Link nodes
node1.next = node2
node2.next = node3

// Print manually
var temp: Node? = node1
while temp != nil {
    print("\(temp!.data) -> ", terminator: "")
    temp = temp!.next
}
print("nil")
