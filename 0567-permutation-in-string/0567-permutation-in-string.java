import java.util.Arrays;
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k=s1.length();
        if (k>s2.length())
            return false;
        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);
        String sorted = new String(arr1);
        for (int i=0; i<=s2.length()-k; i++) {
            String sub = s2.substring(i, i + k);
            char[] arr2 = sub.toCharArray();
            Arrays.sort(arr2);
            if (sorted.equals(new String(arr2))) {
                return true;
            }
        }
        return false;
    }
}