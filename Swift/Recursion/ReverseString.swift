func reverseString(_ s: String) -> String{
    if s.isEmpty {return ""}
    return reverseString(String(s.dropFirst())) + String(s.first!)
}
print(reverseString("hello"))