class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low = 0;
        int length = Integer.MAX_VALUE;
        int ans = 0;
        int k = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int high = 0; high < s.length(); high++){
           char ch = s.charAt(high);
           map.put(ch, map.getOrDefault(ch, 0) + 1);
            k = high - low + 1;
           while(map.size() < k){
            if(map.get(s.charAt(low)) == 1){
                map.remove(s.charAt(low));
            }else{
                map.put(s.charAt(low), map.get(s.charAt(low)) - 1);
            }
            low++;
            k = high - low + 1;
           }
         
              
            ans = Math.max(ans, k);
        }
        return ans;
    }
}