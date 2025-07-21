func removeElement(_ nums: inout [Int], _ val: Int) -> Int {
    var k = 0
    for i in 0..<nums.count {
        if nums[i] != val {
            nums[k] = nums[i]
            k += 1
        }
    }
    return k
}

// Example
var nums = [3, 2, 2, 3]
let val = 3
let k = removeElement(&nums, val)
print("New length: \(k)")
print("Array after removal:", nums.prefix(k))
