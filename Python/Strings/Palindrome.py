def isPalindrome(s) -> bool:
    s = s.lower()
    left, right = 0, len(s)-1
    while left<right:
        if c != s.charAt(right):
            return False
        left+=1
        right-=1
    return True




string = "Madam"
isPalindrome(string)