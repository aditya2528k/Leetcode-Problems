class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits == null || digits.length() == 0){
            return res;
        }

        String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        combo(res, new StringBuilder(), digits, 0, map);
        return res;
    }

    private void combo(List<String> res, StringBuilder curr, String digits, int index, String[] map){
         if (index == digits.length()) {
            res.add(curr.toString());
            return;
        }

        String letters = map[digits.charAt(index) - '0'];

        for (char ch : letters.toCharArray()) {
            curr.append(ch);
            combo(res, curr, digits, index + 1, map);
            curr.deleteCharAt(curr.length() - 1);
        }
    }
}