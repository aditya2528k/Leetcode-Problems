class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> m1 = new HashMap<>();

        for(int i = 0; i < s1.length(); i++){
            char c = s1.charAt(i);
            m1.put(c, m1.getOrDefault(c, 0) + 1);
        }
        int low = 0;
        HashMap<Character, Integer> m2 = new HashMap<>();
        for(int high = 0; high < s2.length(); high++){
            char ch = s2.charAt(high);
            m2.put(ch, m2.getOrDefault(ch, 0) + 1);
            if(high - low + 1 > s1.length()){
               char left = s2.charAt(low);
               if(m2.get(left) == 1){
                m2.remove(left);
               }else{
                m2.put(left, m2.get(left) - 1);
               }
               low++;
            }
            if(m1.equals(m2)){
                return true;
            }
        }
        return false;
    }
}