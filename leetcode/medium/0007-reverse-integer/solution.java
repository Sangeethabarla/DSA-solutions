class Solution {
    public int reverse(int x) {
        long rem,d=0;
        int sign=(x<0)?-1:1;
        long absX=Math.abs((long)x);
        while(absX>0){
            rem=absX%10;
            d=d*10+rem;
            absX=absX/10;
        }
        d=d*sign;
        if(d>Integer.MAX_VALUE || d<Integer.MIN_VALUE){
            return 0;
        }
        return (int)d;
    }
}