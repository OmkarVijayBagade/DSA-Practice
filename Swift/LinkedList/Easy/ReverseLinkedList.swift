class Node {
    var data: Int
    var next: Node?
    init(_ data: Int) {
        self.data = data
        self.next = nil
    }
}

var head: Node? = nil

func insert(_ val: Int) {
    let newNode = Node(val)
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

func reverseList() {
    var prev: Node? = nil
    var curr = head
    while curr != nil {
        let nextTemp = curr?.next
        curr?.next = prev
        prev = curr
        curr = nextTemp
    }
    head = prev
}

func display() {
    var temp = head
    while temp != nil {
        print("\(temp!.data) -> ", terminator: "")
        temp = temp?.next
    }
    print("nil")
}

insert(10)
insert(20)
insert(30)
insert(40)

display()
reverseList()
display()
