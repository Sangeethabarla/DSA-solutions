class Solution {
    public List<String> extractInt(String s) {
        // code here
        ArrayList<String>al=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                sb.append(ch);
            }
            else{
                if(sb.length()>0){
                    al.add(sb.toString());
                    sb.setLength(0);
                }
            }
        }
            if(sb.length()>0){
                al.add(sb.toString());
            }
            return al;
    }
}