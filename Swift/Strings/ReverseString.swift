import Foundation 

func reverseString(_ s: String) -> String {
    var chars = Array(s)
    var left = 0, right = chars.count - 1
    while left < right {
        chars.swapAt(left, right)
        left += 1
        right -= 1
    }
    return String(chars)
}
print(reverseString("hello")) // "olleh"
