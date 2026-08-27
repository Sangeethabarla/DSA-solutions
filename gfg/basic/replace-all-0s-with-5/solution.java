class Solution {
    public int convertFive(int n) {
        // code here
        char arr[]=String.valueOf(n).toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='0'){
                arr[i]='5';
            }
            
        }
        return Integer.parseInt(new String(arr));
    }
}