class Solution {
    public int maxRotateFunction(int[] nums) {
        long sum = 0;
        long f = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            f += (long) i * nums[i];
        }
        long ans = f;
        for (int i = nums.length - 1; i >= 0; i--) {
            f += sum - (long) nums.length * nums[i];
            ans = Math.max(ans, f);
        }
        return (int) ans;
    }
}