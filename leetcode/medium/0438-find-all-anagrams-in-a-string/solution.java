class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> res = new ArrayList<>();
        s=s.toLowerCase();
        p=p.toLowerCase();
        int n=s.length();
        int m=p.length();
        if(m>n)
        return res;
        int c1[] = new int[26];
        int c2[] = new int[26];
        for(int i=0;i<m;i++)
        {
            c1[p.charAt(i) - 'a']++;
            c2[s.charAt(i) - 'a']++;
            }
            if(Arrays.equals(c1,c2))
            res.add(0);
            for(int i=m;i<n;i++)
            {
            c2[s.charAt(i) - 'a']++;
            c2[s.charAt(i - m) - 'a']--;
            if(Arrays.equals(c1,c2))
            res.add(i-m+1);
        }
return res;
    }
}