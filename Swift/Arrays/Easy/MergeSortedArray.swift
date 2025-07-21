import Foundation

func merge(_ nums1: inout [Int], _ m: Int, _ nums2: [Int], _ n: Int) {
    var result = [Int]()
    var i = 0, j = 0

    while i < m && j < n {
        if nums1[i] < nums2[j] {
            result.append(nums1[i])
            i += 1
        } else {
            result.append(nums2[j])
            j += 1
        }
    }

    while i < m {
        result.append(nums1[i])
        i += 1
    }

    while j < n {
        result.append(nums2[j])
        j += 1
    }

    for k in 0..<m+n {
        nums1[k] = result[k]
    }
}

// Example
var nums1 = [1,2,3,0,0,0]
let nums2 = [2,5,6]
merge(&nums1, 3, nums2, 3)
print(nums1)
