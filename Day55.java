class Solution {
    public boolean isAnagram(String s, String t) {
        char[] let = new char[26];
        for (char x : s.toCharArray()) {
            let[x - 'a']++;
        }
        for (char x : t.toCharArray()) {
            let[x - 'a']--;
        }
        for (int i : let) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}