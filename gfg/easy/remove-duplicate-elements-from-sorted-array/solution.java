class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer>al=new ArrayList<>();
        int l=0,r=1;
        al.add(arr[0]);
        while(l<=r && r<=arr.length-1){
            if(arr[l]!=arr[r]){
                al.add(arr[r]);
                l=r;
        }
        r++;
        }
        return al;
    }
}
