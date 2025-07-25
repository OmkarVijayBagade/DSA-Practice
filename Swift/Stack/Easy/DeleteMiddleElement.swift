func deleteMiddleElement(stack: inout[Int], current: Int, size: Int){
    if stack.isEmpty{
        return
    }
    if current == size / 2{
        stack.removeLast()
        return
    }
    let top = stack.removeLast()

    deleteMiddleElement(stack: &stack, current: current+1, size: size)

    stack.append(top)
}
var stack = [1, 2, 69, 3, 4]
let size = stack.count


print("original stack: \(stack)")
deleteMiddleElement(stack: &stack, current: 0, size: size)
print("Stack after deleting middle: \(stack)")