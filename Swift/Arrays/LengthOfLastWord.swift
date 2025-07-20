import Foundation

func lengthOfLastWord(_ s: String) -> Int{
    let trimmed = s.trimmingCharacters(in: .whitespaces)
    var count = 0

    for char in trimmed.reversed() {
        if char != " " {
            count += 1
        }else{
            break
        }
    }
    return count
}

let str = "   fly me   to   the moon  "
print("\n\nLength of the last word in the sentence: \(lengthOfLastWord(str))")