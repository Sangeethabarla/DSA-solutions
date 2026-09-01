class Solution {
    public int minValueToBalance(List<Integer> arr) {
        // code here
        int n=arr.size();
        int m=n/2,sum1=0,sum2=0;
        for(int i=0;i<n;i++){
            if(i<m){
                sum1+=arr.get(i);
            }else{
                sum2+=arr.get(i);
            }
        }
        return Math.abs(sum1-sum2);
    }
    
};