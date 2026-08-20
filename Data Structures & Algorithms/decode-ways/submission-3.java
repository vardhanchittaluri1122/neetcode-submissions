class Solution {
    public int numDecodings(String s) {
        int[] dp = new int[s.length()];
        Arrays.fill(dp, -1);

        return solve(s, 0, dp);
    }

    public int solve(String s, int i, int[] dp) {

        // Reached the end
        if (i == s.length()) {
            return 1;
        }

        // Starts with 0 → invalid
        if (s.charAt(i) == '0') {
            return 0;
        }

        // Already calculated
        if (dp[i] != -1) {
            return dp[i];
        }

        // Take one digit
        int ways = solve(s, i + 1, dp);

        // Take two digits if valid (10 to 26)
        if (i + 1 < s.length() &&
            Integer.parseInt(s.substring(i, i + 2)) <= 26) {

            ways += solve(s, i + 2, dp);
        }

        dp[i] = ways;

        return dp[i];
    }
}