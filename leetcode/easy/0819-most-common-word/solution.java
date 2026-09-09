class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String>s=new HashSet<>(Arrays.asList(banned));
        String[] words=paragraph.replaceAll("[^a-zA-Z]", " ").toLowerCase().split("\\s+");
        HashMap<String,Integer>hm=new HashMap<>();
        for(String word:words){
            if(!s.contains(word)){
                hm.put(word,hm.getOrDefault(word,0)+1);
            }
        }
        String maxword=" ";
        int maxcount=0;
        for(Map.Entry<String,Integer>entry:hm.entrySet()){
            if(entry.getValue()>maxcount){
                maxcount=entry.getValue();
                maxword=entry.getKey();
            }
        }
        return maxword;

    }
}