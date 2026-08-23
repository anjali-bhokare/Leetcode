class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int sum = 0;
        int question = 0;
        for (int i = 0; i < n; i++) {
            if (num.charAt(i) == '?') {
                if (i < n / 2)
                    question++;
                else
                    question--;
            } 
            else {
                int digit = num.charAt(i) - '0';
                if (i < n / 2)
                    sum += digit;
                else
                    sum -= digit;
            }
        }
        return 2 * sum != -9 * question;
    }
}