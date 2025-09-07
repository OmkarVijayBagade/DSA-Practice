import Foundation 

func findMaxMin(_ nums: [Int]) {
    if nums.isEmpty{
        print("Array is empty.")
        return 
    }
    var maxElement = nums[0]
    var minElement = nums[0]
    for num
     in nums {
        if num > maxElement{
            maxElement = num 
        }
        if num < minElement {
            minElement = num 
        }
    }
    print("Maximum: \(maxElement)")
    print("Minimum: \(minElement)")
}

let nums = [5, 2, 9, 1, 7]
findMaxMin(nums)