# 🎯 Problem Statement:
# Imagine your computer’s file system (like in Windows 
# or macOS).
# The root folder is your hard drive (C:\ or /).
# Inside, there are folders and files.
# Each folder can contain other folders and files.

# 👉  the question:
# “Write a function to print all files and folders in 
# a file system in a tree-like structure.”

class FileSystem:
    def __init__(self,name, isFile=False):
        self.name = name 
        self.isFile = isFile
        self.children = [] 

def printFileSystem(node, indent=0):
    prefix = "    " * indent
    print(f"{prefix}{node.name}")

    for child in node.children:
        printFileSystem(child, indent + 1)


root = FileSystem("root")

folder1 = FileSystem("folder1")
folder2 = FileSystem("folder2")

file1 = FileSystem("file1.txt", isFile=True)
file2 = FileSystem("file2.txt", isFile=True)
file3 = FileSystem("file3.txt", isFile=True)
file4 = FileSystem("file4.txt", isFile=True)

root.children.append(folder1)
root.children.append(folder2)

folder1.children.append(file1)
folder1.children.append(file2)
folder1.children.append(file3)
folder2.children.append(file4)

printFileSystem(root)
