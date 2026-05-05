class Solution {
    public boolean isSubsequence(String s, String t) {
        int l = 0, r = 0;
        StringBuilder str=new StringBuilder("");
        while (l < s.length() && r < t.length()) {
            if (s.charAt(l) == t.charAt(r)) {
                str.append(t.charAt(r));
                l++;
            }
            r++;
        }
        return str.toString().equals(s);
}
}
