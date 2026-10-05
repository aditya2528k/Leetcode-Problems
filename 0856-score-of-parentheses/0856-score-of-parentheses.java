class Solution {
    public int scoreOfParentheses(String s) {
        int score = 0;
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(char ch : s.toCharArray()){
            if(ch == '('){
                st.push(0);
            }else{
                int v = st.pop();
                if(v == 0){
                    v = 1;
                }else{
                    v = 2 * v;
                }
                st.push(st.pop() + v);
            } 
        }
        return st.peek();
    }
}