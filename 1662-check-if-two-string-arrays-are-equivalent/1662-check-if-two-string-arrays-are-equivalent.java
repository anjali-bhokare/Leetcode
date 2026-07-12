class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int m = word1.length;
        int n = word2.length;
        int w1 = 0, i = 0;
        int w2 = 0, j = 0;
        while (w1 < m && w2 < n) {
            if (word1[w1].charAt(i) != word2[w2].charAt(j)) {
                return false;
            }
            i++;
            j++;
            if (i == word1[w1].length()) {
                i = 0;
                w1++;
            }
            if (j == word2[w2].length()) {
                j = 0;
                w2++;
            }
        }
        return w1 == m && w2 == n;
    }
}