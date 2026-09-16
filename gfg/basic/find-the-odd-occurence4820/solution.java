class Solution {
    // Method to find the element with odd occurrence in given array
    int getOddOccurrence(int[] arr) {
        // code here
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int x:arr){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        for(Integer x:hm.keySet()){
            if(hm.get(x)%2!=0){
               return x;
            }
        }
        return -1;
    }
}