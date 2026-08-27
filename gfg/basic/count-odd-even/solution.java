class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int n=arr.length;
        int ec=0,oc=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                ec++;
            }else{
                oc++;
            }
        }
        return new int[] {oc,ec};
    }
}