func isPalindrome(_ str: String, _ start: Int, _ end: Int) -> Bool {
    if start >= end { return true }
    let startIndex = str.index(str.startIndex, offsetBy: start)
    let endIndex = str.index(str.startIndex, offsetBy: end)
    if str[startIndex] != str[endIndex] { return false }
    return isPalindrome(str, start + 1, end - 1)
}

let word = "madam"
print(isPalindrome(word, 0, word.count - 1))
