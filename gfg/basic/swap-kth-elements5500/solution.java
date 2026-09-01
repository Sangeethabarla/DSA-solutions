
class Solution {
    public void swapKth(List<Integer> arr, int k) {
        // code here
        int n=arr.size();
        int a=arr.get(k-1);
        int b=arr.get(n-k);
        
        arr.set(k-1,b);
        arr.set(n-k,a);
    }
}
