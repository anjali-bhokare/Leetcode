class Solution {
   public static List<Integer> lexicalOrder(int n) {
        List<Integer> ans = new ArrayList<>();
        for (int i =1;i<= 9;i++) {
            solve(i,n,ans);
        }
        return ans;
    }
    public static void solve(int curr, int n, List<Integer> ans) {
        if (curr>n) {
            return;
        }
        ans.add(curr);
        for (int i=0;i<=9;i++) {
            int newn =curr*10 + i;
            if (newn > n) {
                return;
            }
            solve(newn,n,ans);
        }
    }
        
}