class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        Stack<Character>st=new Stack<>();
        for(int i=0 ;i <s.length();i++){
            char ch =s.charAt(i);
            st.push(ch);
        }
        String ans = "";
        for(int i =0;i<s.length();i++){
            ans+=st.pop();
        }
        return s.equals(ans);
    }
}