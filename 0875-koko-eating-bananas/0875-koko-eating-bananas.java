class Solution {
    public int findMax(int[] piles) {
        int max = piles[0];
        for (int i = 1; i < piles.length; i++) {
            if (piles[i] > max) {
                max = piles[i];
            }
        }
        return max;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = findMax(piles);
        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            long hours = 0;

            for (int i = 0; i < piles.length; i++) {
                hours += (piles[i] + mid - 1L) / mid;
            }

            if (hours <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}