class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        currentcount = 0
        maxcount = 0 
        for i in range(len(nums)):
            if nums[i]==1:
                currentcount+=1
            else :
                maxcount = max(currentcount,maxcount)
                currentcount = 0 

        return max(currentcount , maxcount)