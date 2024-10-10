class Solution {
    public boolean canAliceWin(int[] nums) {
        int sos=0;
        int sod=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10){
                sos=sos+nums[i];
            }if(nums[i] >= 10 && nums[i]< 100){
                sod=sod+nums[i];
            }
        }
    if(sod==sos){
        return false;
    }else{
        return true;
    }
}
}