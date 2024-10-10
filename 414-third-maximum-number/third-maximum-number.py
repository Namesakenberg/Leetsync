class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        uninums = list(set(nums))
        uninums.sort(reverse=True)
        if(len(uninums)>=3):
            return uninums[2]
        else:
            return uninums[0]