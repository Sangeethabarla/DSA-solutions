class Solution {
    public static boolean isPalindrome(int[] arr) {
        // code here
        int l=0,r=arr.length-1;
        while(l<r){
            if(arr[l]!=arr[r]){
                return false;
            }
            l++;r--;
        }
        return true;
            
        
    }
}
