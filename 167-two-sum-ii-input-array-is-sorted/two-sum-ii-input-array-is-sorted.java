class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start=0;
        int end=numbers.length-1;
        for(int i =0;i<numbers.length;i++){
            if(numbers[start]+numbers[end]==target){
                return new int[]{start+1,end+1};
            }
            if(numbers[start]+numbers[end] > target){
                end--;
            }
            if(numbers[start]+numbers[end] < target){
                start++;
            }
        }
        return new int[]{0,0};
    }
}