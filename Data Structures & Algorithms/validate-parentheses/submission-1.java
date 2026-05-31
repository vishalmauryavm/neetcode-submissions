class Solution {
    public boolean isValid(String s) {

        int n=s.length();
        Stack<Character> st = new Stack<>();

        for (int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='['){
                st.push(']');
            }
            else if(c=='{'){
                st.push('}');
            }
            else if(c=='('){
                st.push(')');
            }
            else if(st.empty() || st.pop() !=c){
                return false;
            }
        }
        return st.empty();
    }
}
