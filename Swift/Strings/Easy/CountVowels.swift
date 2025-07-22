func countVowelsAndConsonants(_ s: String) -> (Int, Int) {
    var vowels = 0, consonants = 0
    for ch in s.lowercased() where ch.isLetter {
        if "aeiou".contains(ch) { vowels += 1 } else { consonants += 1 }
    }
    return (vowels, consonants)
}

// Main
let str = "hello world"
let result = countVowelsAndConsonants(str)
print("Vowels: \(result.0), Consonants: \(result.1)")
