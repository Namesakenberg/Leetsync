class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        n = len(nums)  # Get the length of the array
        k = k % n      # Handle cases where k is greater than n
        nums[:] = nums[-k:] + nums[:-k]  # Rotate using slicing