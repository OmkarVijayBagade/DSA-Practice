func evaluatePostfix(_ tokens: [String]) -> Int{
    var stack = [Int]()

    for token in tokens{
        if isOperator(token){
            let b = stack.removeLast()
            let a = stack.removeLast()
            let result = applyOperator(a,b,token)
            stack.append(result)
        }else{
            stack.append(Int(token)!)
        }
    }
    return stack.removeLast()
}
func isOperator(_ token: String )->Bool{
    return token == "+" || token == "-" || token == "*" || token == "/"  
}
func applyOperator(_ a: Int, _ b: Int, _ op: String) -> Int{
    switch op {
    case "+": return a + b
    case "-": return a + b
    case "*": return a + b
    case "/": return a + b
    default: return 0
    }
}
let tokens = ["2", "1", "+", "3", "*"]
print(tokens)
print("Result: \(evaluatePostfix(tokens))") 