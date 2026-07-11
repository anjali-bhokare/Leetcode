class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int index=0;
        int i=0;
        while(i<n){
            char curr=chars[i];
            int count=0;
            while(i<n && chars[i]==curr){
                count++;
                i++;
            }
            chars[index++] = curr;
      if (count > 1) {
        for (char c : String.valueOf(count).toCharArray()) {
                    chars[index++] = c;
        }
      }
        }
       return index;
    }
}