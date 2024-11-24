class Solution:
    def minimumSumSubarray(self, nums: List[int], l: int, r: int) -> int:
        ans = float('inf')  
        found = False       

        for i in range(len(nums)):  
            add = 0  
            for j in range(i, len(nums)): 
                add += nums[j]
                val = (j - i) + 1 
                if l <= val <= r:  
                    if add > 0:  
                        ans = min(ans, add)  
                        found = True

        return ans if found else -1  