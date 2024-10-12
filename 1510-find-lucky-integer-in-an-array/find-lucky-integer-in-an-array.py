class Solution:
    def findLucky(self, arr: List[int]) -> int:
        maxcount=-1
        for i in arr:
            count=0
            tobecount=i
            
            for j in arr:
                if j==tobecount:
                    count+=1
            if count==tobecount:
                maxcount=max(maxcount,count)
        if maxcount>0:
            return maxcount
        else:
            return -1
