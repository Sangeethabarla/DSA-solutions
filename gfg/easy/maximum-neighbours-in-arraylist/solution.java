class Solution {
    public static ArrayList<Integer> maxNeighbour(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer>al=new ArrayList<>();
        int n=arr.size();
        for(int i=0;i<n-1;i++){
            al.add(Math.max(arr.get(i),arr.get(i+1)));
        }
        return al;
    }
}