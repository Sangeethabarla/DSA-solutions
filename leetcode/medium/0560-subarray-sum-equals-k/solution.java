class Solution {
    public int subarraySum(int[] nums, int k) {
        int l=0,r=0,c=0;
        int sum=0;
        while(r<nums.length){
            sum+=nums[r];
            while(sum>k){
                sum-=nums[l];
                l++;
            }
            if(sum==k){
            c++;
            }
            r++;
            }
        return c;
    }
}