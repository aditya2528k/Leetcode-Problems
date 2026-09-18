class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.length() == 0) {
            return res;
        }
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        StringBuilder diary = new StringBuilder();
        fun(digits, 0, map, res, diary);
        return res;
    }

    void fun(String s, int index, HashMap<Character, String> map,
        List<String> res, StringBuilder diary) {
        if (index == s.length()) {
            res.add(diary.toString());
            return;
        }
        String choice = map.get(s.charAt(index));
        for (int j = 0; j < choice.length(); j++) {
            diary.append(choice.charAt(j));
            fun(s, index + 1, map, res, diary);
            diary.deleteCharAt(diary.length() - 1);
        }
    }
}