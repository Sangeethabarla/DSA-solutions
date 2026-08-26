class Solution {
    public static int maxConsecutiveOnes(int n) {
        // code here
        String bs=Integer.toBinaryString(n);
        char ch[]=bs.toCharArray();
        int max=0,count=0;
        for(int i=0;i<ch.length;i++){
            if(bs.charAt(i)=='1'){
                count++;
            }else{count=0;}
            max=Math.max(max,count);
        }
        return max;
    }
}
