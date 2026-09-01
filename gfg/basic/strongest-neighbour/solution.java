class Solution {
    public ArrayList<Integer> maxAdj(int[] arr) {
        // code here
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            al.add(Math.max(arr[i],arr[i+1]));
        }
        return al;
    }
};