class Solution {
    public boolean checkPowersOfThree(int n) {
        //if we divide a number by 3 and get remainder 2 , 
        //that number can never be expressed in terms of distinct powers of 3.
        //for the numbers divisible by 3 . check by dividing the quotient
        // example - 
        // n = 15
        // 15 % 3 is 0 , but 15 / 3 is 5 , and 5 % 3 is 2. hence false
        while(n>0){
            if(n%3 == 2){
                return false;
            }
            n/=3;
        }
        return true;
    }
}