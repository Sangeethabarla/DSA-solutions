class Solution {
    public int getMaxVal(List<Integer> arr, int k) {
        // code here
        Collections.sort(arr);
        Collections.reverse(arr);
        int max=0;
        for(int i=0;i<k;i++){
            max+=arr.get(i);
        }
        return max;
    }
}