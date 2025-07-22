import Foundation 

func removeWhiteSpaces(_ s: String) -> String {
    return s.replacingOccurrences(of: " ", with:"")
}
let s = " hello    world   "
print("\(removeWhiteSpaces(s))")

 