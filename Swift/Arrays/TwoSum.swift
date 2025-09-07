import Foundation 

func twoSum(_ nums: [Int], _ target: Int) -> [Int] {
    for i in 0..<nums.count{
        for j in 0..<nums.count{
            if nums[i] + nums[j] == target {
                print("Elements: \(nums[i]) and \(nums[j])")
                return [i, j]
            }
        }
    }
    return []
}

let nums = [2,1,5,6,7,9]
let target = 12
let result = twoSum(nums, target)
if result.isEmpty{
    print("No pair found.")
}else {
    print("Indices: \(result[0]) and \(result[1])")
}