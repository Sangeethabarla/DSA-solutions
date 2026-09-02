class Solution {
    static ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        int n=arr.length;
        ArrayList<Integer>al=new ArrayList<>();
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<n;i++){
            if(hs.add(arr[i]))
            al.add(arr[i]);
        }
        return al;
        
    }
}