class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        nums.sort()
        ans=[]
        for i in range (len(nums)):
            index = abs(nums[i])-1
            nums[index] = -abs(nums[index])
        for i in range (len(nums)):
            if nums[i]>0:
                ans.append(i+1)
        return ans
            
          
