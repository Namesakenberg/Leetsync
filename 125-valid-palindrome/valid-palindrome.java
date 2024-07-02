class Solution {
    public boolean isPalindrome(String s) {
          s = s.toLowerCase().replaceAll("[^a-z0-9]", ""); 
          return isPalindromechecker(s,0,s.length()-1);
    }
    private boolean isPalindromechecker(String s , int left , int right){
        while(left>=right){
            return true;
        }
        if(s.charAt(left)!=s.charAt(right)){
            return false;
        }
        return isPalindromechecker(s,left+1,right-1);
    }
}