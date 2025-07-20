import Foundation 

func removeDuplicates(_ nums : inout[Int]) -> Int {
    if nums.isEmpty{return 0}

    var i = 0
    for j in 0..<nums.count {
        if nums[j] != nums[i] {
            i += 1 
            nums[i] = nums[j]
        }
    }
    return i+1
}

var nums = [1,1,2,2,3]
print("\(removeDuplicates(&nums))")
