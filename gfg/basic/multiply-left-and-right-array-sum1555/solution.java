class Solution {
    public int multiply(int[] arr) {
        // code here
        int n=arr.length;
        int m=n/2;
        int sum1=0,sum2=0;
        for(int i=0;i<n;i++){
            if(i<m){
                sum1+=arr[i];
            }else{
                sum2+=arr[i];
            }
        }
        return sum1*sum2;
    }
}
