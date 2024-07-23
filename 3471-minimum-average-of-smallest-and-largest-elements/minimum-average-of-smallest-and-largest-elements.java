class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);  //sort the array for eaisly finding start and end
        int start=0;  //first element
        int end = nums.length-1;  //last element
        double ans=1000; //consider ans as a huge value in comparison to the average
        while(start<end){
            double avg=(nums[start]+nums[end])/2.0;
            ans=Math.min(avg,ans);
            start++;
            end--;
        }
        return ans;   
    }
}