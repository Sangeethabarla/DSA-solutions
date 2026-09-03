class Solution {
    public long product(long arr[]) {
        // code here
        long p=1;
        long mod=1000000007;
        for(int i=0;i<arr.length;i++){
            p=(p*(arr[i]%mod))%mod;
        }
        return p;
    }
}