class Solution {
    public long minMaxProduct(int[] arr1, int[] arr2) {
        long max=arr1[0],min=arr2[0];
        int n=Math.max(arr1.length,arr2.length);
        for(int i=0;i<n;i++){
            if(i<arr1.length && arr1[i]>max) 
            max=arr1[i];
            if(i<arr2.length && arr2[i]<min)
            min=arr2[i];
        }
        return max*min;
    }
}