class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        if(p.length()>s.length()) return ans;
        int[] pFreq=new int [26];
        int[] windowfreq=new int[26];

        for(char ch:p.toCharArray()){
            pFreq[ch-'a']++;
        }
        int windowSize =p.length();
        for(int right=0;right<s.length();right++){
            windowfreq[s.charAt(right)-'a']++;
            if(right>=windowSize){
                char removed=s.charAt(right-windowSize);
                windowfreq[removed-'a']--;
            }
            if(Arrays.equals(pFreq,windowfreq)){
                ans.add(right-windowSize +1);
            }
        }
        return ans;
    }
}