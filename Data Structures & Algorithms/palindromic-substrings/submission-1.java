class Solution {
    public int countSubstrings(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {

            // Odd-length palindromes
            sum += palindrome(s, i, i);

            // Even-length palindromes
            sum += palindrome(s, i, i + 1);
        }

        return sum;
    }

    public int palindrome(String s, int l, int r) {
        int c = 0;

        while (l >= 0 && r < s.length() &&
               s.charAt(l) == s.charAt(r)) {

            c++;
            l--;
            r++;
        }

        return c;
    }
}