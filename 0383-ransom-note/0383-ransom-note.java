class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> m1 = new HashMap<>();
        HashMap<Character, Integer> m2 = new HashMap<>();
        for(int i = 0; i < magazine.length(); i++){
            char c = magazine.charAt(i);
            m2.put(c, m2.getOrDefault(c, 0) + 1);
        }
        for(int i = 0; i < ransomNote.length(); i++){
            char c = ransomNote.charAt(i);
            if(!m2.containsKey(c)){
                return false;
            }else if(m2.containsKey(c) && m2.get(c) == 1){
                m2.remove(c);
            }else{
                m2.put(c, m2.get(c) - 1);
            }
        }
        return true;
    }
}