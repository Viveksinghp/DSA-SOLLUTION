class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen=0;
        int n=s.length();
        int i=0,j=0;
        HashMap<Character, Integer> map=new HashMap<>();
        while(j<n){
            char ch=s.charAt(j);
            if(map.containsKey(ch) && map.get(ch)>=i){
                int len=j-i;
                maxlen=Math.max(maxlen,len);
                // i ko leke jao ch ki purani position se aage
                while(s.charAt(i)!=ch) i++;
                i++;
            }
            map.put(ch,j);
            j++;
        } 
        int len=j-i;
        maxlen=Math.max(maxlen,len);
        return maxlen;
        
        
           }
}