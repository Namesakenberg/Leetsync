class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>st=new Stack<>();
        
        for(int i=0 ;i< s.length();i++){
          char ch = s.charAt(i);
          if(!st.isEmpty() && st.peek()==ch){  //if the stack is not empty and the last element is the same as ch then pop it out
        st.pop();
          }
          else{
            st.push(ch);    //if not push it in the stack
          }
        }
        StringBuilder ans = new StringBuilder();
        for(int  i= 0 ;i < st.size() ; i++){
            ans.append(st.get(i));
        }
          return ans.toString();
    }
}