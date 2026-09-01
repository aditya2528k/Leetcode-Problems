class Solution {
    class pair{
        char ch;
        int count;

        pair(char ch, int count){
            this.ch = ch;
            this.count = count;
        }
    }
    public String removeDuplicates(String s, int k) {
        Stack<pair> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(!st.isEmpty() && st.peek().ch == ch){
                st.peek().count++;
                if(st.peek().count == k){
                    st.pop();
                }
            }else{
                st.push(new pair(ch, 1));
            }
        }
        while(!st.isEmpty()){
            pair p = st.pop();
            for(int i = 0; i < p.count; i++){
                ans.append(p.ch);
            }
        }
        return ans.reverse().toString();
    }
}