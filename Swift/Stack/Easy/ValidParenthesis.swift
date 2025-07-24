func isValid(_ s: String) -> Bool {
    var stack: [Character] = []

    for ch in s {
        if ch == "(" || ch == "{" || ch == "[" {
            stack.append(ch)
        } else {
            if stack.isEmpty { return false }
            let last = stack.removeLast()
            if (ch == ")" && last != "(") ||
               (ch == "}" && last != "{") ||
               (ch == "]" && last != "[") {
                return false
            }
        }
    }
    return stack.isEmpty
}

// Test
print(isValid("{[()]}")) // true
print(isValid("(]"))    // false
