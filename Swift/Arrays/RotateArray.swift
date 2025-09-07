import Foundation 

func rotate(_ nums: inout [Int], _ k: Int) {
    let n = nums.count
    let steps = k % n
    let rotated = Array(nums[(n - steps)...] + nums[..<(n - steps)])
    nums = rotated
}

// Example
var nums = [1,2,3,4,5,6,7]
rotate(&nums, 3)
print("Rotated Array: \(nums)")
