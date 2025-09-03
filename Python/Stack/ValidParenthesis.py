from StackUsingLL import Stack 

def is_valid_parenthesis(string):
    bracket_map = {
        ')':'(',
        '}':'{',
        ']':'['
    }

    stack = Stack() 

    for char in string:
        if char in bracket_map.values():
            stack.addElement(char)
        elif char in bracket_map:
            if stack.isEmpty() or stack.pop() != bracket_map[char]:
                return False
        else:
            continue  
    return stack.isEmpty() 

print(is_valid_parenthesis("(){}[]"))  
print(is_valid_parenthesis("([{}])"))   
print(is_valid_parenthesis("([)]"))     
print(is_valid_parenthesis("((("))
print(is_valid_parenthesis("a+(b*c)"))  