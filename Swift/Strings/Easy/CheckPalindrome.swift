func isPalindrome(_ s: String) -> Bool {
    let chars = Array(s.lowercased())
    var left = 0, right = chars.count - 1
    while left < right {
        if chars[left] != chars[right] {
            return false
        }
        left += 1
        right -= 1
    }
    return true
}

// Example
print(isPalindrome("Racecar")) // true
print(isPalindrome("hello"))   // false
