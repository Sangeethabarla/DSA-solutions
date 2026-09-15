class Solution {
    public static int intersectSize(int a[], int b[]) {
        // Your code here
        Arrays.sort(a);Arrays.sort(b);
        int l=0,r=0,c=0;
        while(l<a.length && r<b.length){
            if(a[l]==b[r]){
                c++;
                l++;r++;
            }else if(a[l]<b[r]){
                l++;
            }else{
                r++;
            }
        }
        return c;
    }
}