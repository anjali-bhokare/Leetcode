class Solution {
    int[] q = new int[45];
    int n = 0;

    public Solution() {
        for (int i = 1; i < 10; i++) {
            q[n++] = i;
        }
        for (int i = 0; i < n; i++) {
            int d = q[i] % 10;
            if (d < 9) {
                q[n++] = q[i] * 10 + d + 1;
            }
        }
    }

    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (q[i] >= low && q[i] <= high) {
                res.add(q[i]);
            }
        }
        return res;
    }
}