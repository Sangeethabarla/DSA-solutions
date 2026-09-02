class Solution {
    public void segregateElements(int[] arr) {
        // code here
        int n=arr.length;
        int temp[]=new int[n];int x=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                temp[x++]=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                temp[x++]=arr[i];
            }
        }
        
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
        
    }
}