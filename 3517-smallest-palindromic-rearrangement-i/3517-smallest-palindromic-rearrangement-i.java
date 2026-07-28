class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();
        int[] freq = new int[26];
        for (int i = 0; i < n / 2; i++) {
            freq[arr[i] -'a']++;
        }
        int left = 0;
        for (int i = 0; i < 26; i++) {
            while (freq[i] > 0) {
                char ch = (char) ('a' + i);
                arr[left] = ch;
                arr[n - 1 - left] = ch;
                left++;
                freq[i]--;
            }
        }
        return new String(arr);
    }
}