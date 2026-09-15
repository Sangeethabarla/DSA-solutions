class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int sum=0;
        int n=arr.length;
        int l=0,r=k-1;
        for(int i=l;i<=r;i++){
            sum+=arr[i];
            
        }
        int maxsum=sum;
        while(r<n-1){
            sum-=arr[l];
            l++;r++;
            sum+=arr[r];
         if(sum>maxsum){
                maxsum=sum;
            }
        }
        return maxsum;
    }
}