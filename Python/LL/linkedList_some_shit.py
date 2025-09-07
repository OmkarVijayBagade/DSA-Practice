class Node:
    def __init__(self,data):
        self.data = data
        self.next = None 

# --------------------------------------------------
#   Add at Beginning
# --------------------------------------------------

def add_at_beginning(head,data):
    new_node = Node(data)
    new_node.next = head 
    return new_node
 
# --------------------------------------------------
#   Print List
# -------------------------------------------------- 

def print_list(head):
    current = head 
    while current :
        print(current.data, end=" ->> ")
        current = current.next
    print('None')


# --------------------------------------------------
#   Add at Tail
# --------------------------------------------------

def add_at_tail(head,data):
    new_node = Node(data)
    if not head:
        return new_node
    current = head 
    while current.next:
        current = current.next 
    current.next = new_node 
    return head 

# --------------------------------------------------
#   Pop last Element from the list 
# --------------------------------------------------

def pop(head):
    if not head:
        return None 
    if not head.next:
        return None 
    current = head 
    while current.next.next: 
        current=current.next 
    current.next=None 
    return head 

# --------------------------------------------------
#   Remove Element from the list 
# --------------------------------------------------

def remove_element(head,data):
    if not head:
        return None 
    if head.data == data:
        return head.next
    current = head 
    while current.next and current.next.data != data:
        current = current.next
    if current.next : 
        current.next = current.next.next 
    return head 

# __________________________________________________
# --------------------------------------------------
#   example usage
# __________________________________________________
# --------------------------------------------------

head = None 
head = add_at_beginning(head, 10)
head = add_at_tail(head, 20)
head = add_at_tail(head, 50)
head = add_at_beginning(head, 5)

print("\nInitial Linked List:")
print_list(head)

pop(head)

print("\nAfter Pop Last Element:")
print_list(head)

remove_element(head, 20)

print("\nAfter Removing Element:")
print_list(head)

head = add_at_tail(head, 40)
head = add_at_tail(head, 60)

print("\nNew List:")
print_list(head)


