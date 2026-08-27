class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character>set=new HashSet<>();
        int count=0;
        for(char i:jewels.toCharArray()){
            set.add(i);
        }
        for(char s:stones.toCharArray()){
            if(set.contains(s)){
                count++;
            }
        }
        return count;
    }
}