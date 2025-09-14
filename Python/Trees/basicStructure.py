from collections import deque

class Node:
    def __init__(self,data):
        self.data = data 
        self.left = None 
        self.right = None 

def preorder(node):
    """ root -> left -> right """
    if node: 
        print(node.data, end=' ')
        preorder(node.left)
        preorder(node.right)

def postorder(node):
    """ left -> right -> root """
    if node: 
        postorder(node.left)
        postorder(node.right)
        print(node.data,end=' ')
    
def inorder(node):
    """ left -> root -> right """
    if node:
        inorder(node.left)
        print(node.data, end=" ")
        inorder(node.right)

# tree construction
root = Node(1)
root.left = Node(2)
root.right = Node(3)
root.left.left = Node(4)
root.left.right = Node(5)

print("\nPreorder Traversal: ",end=' ')
preorder(root)
print("\n")

print("\nPost Traversal: ",end=' ')
postorder(root)
print("\n")

print("\nInorder Traversal: ",end=' ')
inorder(root)
print("\n")