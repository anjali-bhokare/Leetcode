class Solution {
    public boolean isvowel(char ch){
        return(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U');
    }
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        int mid=n/2;
        int i=0;
        int j=mid;
        int cntl=0;
        int cntr=0;
        while(i<n/2 && j<n){
            if(isvowel(s.charAt(i))){
                cntl++;
            }
            if(isvowel(s.charAt(j))){
                cntr++;
            }
            i++;
            j++;
        }
        return cntl==cntr;
    }
}