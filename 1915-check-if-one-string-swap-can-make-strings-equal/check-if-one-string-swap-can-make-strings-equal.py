class Solution:
    def areAlmostEqual(self, s1: str, s2: str) -> bool:
        if(len(s1)!= len(s2)):
            return False
        if((sorted(s1))!=(sorted(s2))):
            return False
        ans = False
        count = 0
        for i in range (len(s1)):
            if s1[i]!=s2[i]:
                count+=1
        if count == 2 or count ==0:
                ans =True
        return ans

        