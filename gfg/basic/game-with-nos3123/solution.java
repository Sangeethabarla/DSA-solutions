class Solution {
    public ArrayList<Integer> xorArray(int[] arr) {
        // code here
        ArrayList<Integer>al=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            al.add(arr[i]^arr[i+1]);
        }
        al.add(arr[n-1]);
        return al;
    }
}