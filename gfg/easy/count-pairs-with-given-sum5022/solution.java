class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // code here
        
        ArrayList<ArrayList<Integer>>al=new ArrayList<>();
        Arrays.sort(arr);
        Set<ArrayList<Integer>>s=new HashSet<>();
        int l=0,r=arr.length-1;
        while(l<r){
            if(arr[l]+arr[r]==0){
                ArrayList<Integer>al2=new ArrayList<>();
                al2.add(arr[l]);
                al2.add(arr[r]);
                if(s.add(al2)){
                al.add(al2);
                }
                l++;
                r--;
            }else if(arr[l]+arr[r]<0){
                l++;
            }else{
                r--;
            }
        }
        return al;
    }
}
