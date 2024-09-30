class Solution:
    def minElement(self, nums: List[int]) -> int:
        digit_sums = []  # Use a better name than `list`
        
        for i in nums:
            ans = 0
            # Calculate the sum of digits for each number
            while i > 0:
                rem = i % 10
                ans += rem
                i = i // 10
            digit_sums.append(ans)  # Append the sum of digits to the list
        
        # Sort the list of digit sums
        digit_sums.sort()
        
        # Return the smallest sum of digits
        return digit_sums[0]