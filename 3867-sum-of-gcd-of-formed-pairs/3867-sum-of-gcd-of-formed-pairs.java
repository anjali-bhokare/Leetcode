class Solution {
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            nums[i]=gcd(max,nums[i]);
        }
        Arrays.sort(nums);
        int left=0;
        int right=n-1;
        long ans=0;
        while(left<right){
            ans=ans+gcd(nums[left],nums[right]);
            left++;
            right--;
        }
        return ans;
    } 
    public int gcd(int a,int b){
        while(b!=0){
            int t=a%b;
            a=b;
            b=t;
        }
        return a;
    }
}