class Solution {

    public String longestPalindrome(String s) {

        int resLen = 0;
        int resIdx = 0;

        for (int i = 0; i < s.length(); i++) {

            // Odd length
            int[] odd = palindrome(s, i, i);

            if (odd[1] > resLen) {
                resIdx = odd[0];
                resLen = odd[1];
            }

            // Even length
            int[] even = palindrome(s, i, i + 1);

            if (even[1] > resLen) {
                resIdx = even[0];
                resLen = even[1];
            }
        }

        return s.substring(resIdx, resIdx + resLen);
    }

    public int[] palindrome(String s, int l, int r) {

        while (l >= 0 && r < s.length()
                && s.charAt(l) == s.charAt(r)) {

            l--;
            r++;
        }

        l++;
        r--;

        return new int[]{l, r - l + 1};
    }
}