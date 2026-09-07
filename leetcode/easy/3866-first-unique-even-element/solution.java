class Solution {
    public int firstUniqueEven(int[] nums) {
        int[] counts = new int[101];
        
        for (int num : nums) {
            counts[num]++;
        }
        
        for (int num : nums) {
            if (num % 2 == 0 && counts[num] == 1) {
                return num;
            }
        }
        
        return -1;
    }
}