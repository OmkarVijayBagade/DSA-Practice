#string compression leetcode question
from typing import List

class Solution:
    def compress(self, chars: List[str]) -> int:
        write = 0
        read = 0
        
        while read < len(chars):
            char = chars[read]
            count = 0
            
            # count duplicates
            while read < len(chars) and chars[read] == char:
                read += 1
                count += 1
            
            # write the character
            chars[write] = char
            write += 1
            
            # write the count (if > 1)
            if count > 1:
                for c in str(count):
                    chars[write] = c
                    write += 1
        
        return write
chars = ["a","a","b","b","c","c","c"]
sol = Solution()
length = sol.compress(chars)
print(length)   # 6
print(chars[:length])  # ["a","2","b","2","c","3"]
