// Reverse a String using Stack
// Problem

// Given a string s, reverse it using a stack.

// Example

// Input:  "hello"
// Output: "olleh"

func reverseString(_ s: String) -> String{
    var stack: [Character] = []
    //pushing each character in stack
    for char in s {
        stack.append(char)
    }
    var reversed = ""
    //pop characters to build reversed string
    while !stack.isEmpty{
        reversed.append(stack.removeLast())

    }
    return reversed
}

let input = "hello"
print("Original: \(input)")
print("Reversed: \(reverseString(input))")