class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        boolean odd = false;
        int len = 0;
        for(int val : map.values()){
            if(val % 2 == 0){
                len += val;
            }else{
                len += val - 1;
                odd = true;
            }
        }
        if(odd){
            len++;
        }
        return len;
    }
}