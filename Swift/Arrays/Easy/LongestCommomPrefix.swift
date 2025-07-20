// Write a function to find the longest common prefix string amongst an array of strings.
// 
// If there is no common prefix, return an empty string "".


import Foundation 

func longestCommonPrefix(_ strs: String) -> String {
    if strs.isEmpty() { return ""}

    var prefix = strs[0]

    for str in strs.dropFirst(){
        while !str.hasPrefix(prefix) {
            prefix = String(prefix.dropLast())
            if prefix.isEmpty(){return ""}
        }   
    }return prefix
}

