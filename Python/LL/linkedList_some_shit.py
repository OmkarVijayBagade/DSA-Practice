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

# --------------------------------------------------
#   Reverse the list 
# --------------------------------------------------

def do_something_crazy(head):
    result = []
    current = head 
    while current:
        result.append(current.data)
        current = current.next 
    
    index = len(result) - 1
    while index >= 0:
        print(result[index], end=' -> ')
        index = index - 1
    print('None') 

# --------------------------------------------------
#  Calculate the length of the list
# --------------------------------------------------

def length_of_list(head):
    length = 0
    current = head 
    while current:
        length += 1
        current = current.next 
    return f"\nLength of linked list: {length}"

# --------------------------------------------------
#  Calculate the length of the list
# --------------------------------------------------

def find_middle_element(head):
    fast = head 
    slow = head 
    while fast and fast.next:
        fast = fast.next.next
        slow = slow.next
    return slow.data if slow else None

# --------------------------------------------------
#  Find nth element in the list
# --------------------------------------------------

def find_nth_element(head,n):
    first = head 
    second = head 
    for _ in range(n):
        if not first:
            return None
        first = first.next
    while first:
        first = first.next
        second = second.next
    return second.data if second else None

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

print("\nInitial Linked List:",end=' ')
print_list(head)

pop(head)

print("\nAfter Pop Last Element:",end=' ')
print_list(head)

remove_element(head, 20)

print("\nAfter Removing Element:",end=' ')
print_list(head)

head = add_at_tail(head, 40)
head = add_at_tail(head, 60)

print("\nNew List:",end=' ')
print_list(head)

print("\nReversed Print:", end=' ')
do_something_crazy(head)

print(length_of_list(head))

print("\nMiddle element in list:",end=' ')
print(find_middle_element(head))

print(f"\nFind nth element: ",end=' ')
print(find_nth_element(head,50))








