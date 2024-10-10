class Solution:
    def canAliceWin(self, nums):
        sos = 0
        sod = 0

        for num in nums:
            if num < 10:
                sos += num
            elif 10 <= num < 100:
                sod += num

        return sos != sod
