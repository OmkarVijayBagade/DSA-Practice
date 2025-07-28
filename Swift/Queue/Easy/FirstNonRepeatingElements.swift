import Foundation

func firstNonRepeating(_ A: String) -> String {
    var freq = [Int](repeating: 0, count: 26)
    var q = [Character]()
    var result = ""

    for ch in A {
        let idx = Int(ch.asciiValue! - Character("a").asciiValue!)
        freq[idx] += 1
        q.append(ch)

        while let front = q.first, freq[Int(front.asciiValue! - Character("a").asciiValue!)] > 1 {
            q.removeFirst()
        }

        result.append(q.first ?? "#")
    }

    return result
}

// Example
let input = "aabc"
print(firstNonRepeating(input)) // Output: a#bb
