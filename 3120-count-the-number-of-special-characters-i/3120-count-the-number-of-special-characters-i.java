class Solution {
    public int numberOfSpecialChars(String word) {
        int count=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:word.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1 );
        }
        for(char ch='A';ch<='Z';ch++){
            char lower=(char)(ch+32);
        
        if(map.containsKey(lower) && map.containsKey(ch)){
            count++;
        }
        }
        return count;
    }
}