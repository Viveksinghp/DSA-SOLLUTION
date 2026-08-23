class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            String key=sort(s);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
    public String sort(String s){
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}