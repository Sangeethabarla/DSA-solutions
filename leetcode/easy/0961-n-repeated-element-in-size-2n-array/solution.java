class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int x:nums){
            if(!hs.add(x)){
                return x;
            }
        }
        return -1;
    }
}