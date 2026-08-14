class Solution {
    public int maximumLengthSubstring(String s) {
        int freq[]=new int[26];
        int maxlength=0;
        int left=0;
        for(int right=0;right<s.length();right++){
            freq[s.charAt(right)-'a']++;
        
        while(freq[s.charAt(right)-'a']>2){
            freq[s.charAt(left)-'a']--;
            left++;
        }
        maxlength=Math.max(maxlength,right-left+1);
        }
        return maxlength;
    }
}