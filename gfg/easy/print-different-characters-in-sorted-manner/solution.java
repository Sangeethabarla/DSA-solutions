class Solution {
    public String sortedDistinct(String s) {
        // code here
        TreeSet<Character>ts=new TreeSet<>();
        for(int i=0;i<s.length();i++){
            ts.add(s.charAt(i));
        }
        StringBuilder sb=new StringBuilder();
        for(char c:ts){
            sb.append(c);
        }
        return sb.toString();
    }
    
}
