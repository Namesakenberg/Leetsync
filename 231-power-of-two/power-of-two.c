bool isPowerOfTwo(int n) {
  //base case 
  if(n==1){
    return true;
  }
  if(n<=0 || n%2!=0 ){
    return false;
  }
  return isPowerOfTwo(n/2);
}