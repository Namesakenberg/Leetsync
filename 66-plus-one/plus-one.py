class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        # Start from the last index and iterate backwards
        for i in range(len(digits) - 1, -1, -1):
            if digits[i] == 9:
                digits[i] = 0  # Set the current digit to 0 if it was 9
            else:
                digits[i] += 1  # Increment the current digit
                return digits  # Return the result if no carry is needed
        
        # If we are here, it means all digits were 9
        return [1] + digits  # Add a leading 1 for cases like 999 -> 1000
