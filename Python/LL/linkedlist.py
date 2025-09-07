class Node:
    def __init__(self,data):
        self.data = data
        self.next = None

node1 = Node(10)
node2 = Node(100)
node3 = Node(1000)

node1.next = node2
node2.next = node3

# -------------------------------------------------
# -------------------------------------------------
#printing the linked list without function or loop 
# -------------------------------------------------
# -------------------------------------------------

head = node1 
current = head 
while current is not None:
    print(current.data,end='->')
    current = current.next
print('None')

# -------------------------------------------------
# -------------------------------------------------
#adding new node in the linked list using function 
# -------------------------------------------------
# -------------------------------------------------

def print_list(head):
    current = head 
    while current : 
        print(current.data,end='>>')
        current = current.next 
    print('None')

print_list(node1)

new_node = Node(50)
new_node.next = node1
head = new_node

print_list(new_node)

# -------------------------------------------------
# -------------------------------------------------
#adding new node at tail in LL using function 
# -------------------------------------------------
# -------------------------------------------------

def add_at_tail(head,data):
    new_node = Node(data)
    if not head:
        return new_node
    current = head 
    while current.next: 
        current = current.next 
    current.next = new_node
    return head 


head = add_at_tail(head, 3)

print_list(head)








