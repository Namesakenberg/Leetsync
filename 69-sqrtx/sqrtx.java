class Solution {
    public int mySqrt(int x) {
        //use bianry search concept
        int start=0;
        int end=x;
        while(start<=end){
            int mid = start + (end-start)/2;
            long midsquared = (long)mid*mid;
            if(midsquared == x){
                return mid;
            }
            if(midsquared<x){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
         return end;
    }
}