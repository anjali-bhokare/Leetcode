class Solution {
    public long[] resultArray(int[] A, int k) {
        long[] ans = new long[k];
        int[] dp = new int[k];
        for (int num : A) {
            num %= k;
            int[] next = new int[k];
            next[num] = 1;
            for (int r = 0; r < k; r++)
                next[r * num % k] += dp[r];
            dp = next;
            for (int r = 0; r < k; r++)
                ans[r] += dp[r];
        }
        return ans;
    }
}