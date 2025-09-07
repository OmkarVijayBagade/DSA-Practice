class Node{
    var data: Int
    var next: Node?
    init(_ data: Int) {
        self.data = data
        self.next = nil
    }
}
var head: Node? = nil
func insert(_ val: Int){
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
func countNodes() -> Int{
    if head == nil {
        return -1
    }
    var temp = head 
    var count = 0
    while temp != nil {
        count += 1
        temp = temp?.next
    }
    return count
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
print("Number of Nodes: \(countNodes())")