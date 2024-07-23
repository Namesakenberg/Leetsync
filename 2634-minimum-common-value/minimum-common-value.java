class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        for(int i=0;i<nums2.length;i++){
            int start=0;
            int end=nums1.length-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(nums2[i]==nums1[mid]){
                    return nums1[mid];
                }
                if(nums2[i]<nums1[mid]){
                      end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
       return -1; 
    }
}