class Solution {
    public static int[] decrementArray(int[] arr, int n) {
        // code here
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            res[i]=arr[i]-1;
        }
        return res;
    }
}