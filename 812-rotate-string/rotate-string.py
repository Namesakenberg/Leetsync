class Solution:
    def rotateString(self, s: str, goal: str) -> bool:
        for i in range(len(s)):
            ans=s[i:]+s[:i]
            if(ans==goal):
                return True
        else:
            return False
            