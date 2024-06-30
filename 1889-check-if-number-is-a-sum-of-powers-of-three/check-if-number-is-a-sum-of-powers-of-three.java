class Solution {
    public boolean checkPowersOfThree(int n) {
        //if the number has a remainder when divided by 3 then it is not the ans
        while(n>0){
            if(n%3 ==2 ){
                return false;
            }
            n/=3;
        }
        return true;
    }
}