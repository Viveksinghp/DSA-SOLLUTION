class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        String ans="";
        String prefix=strs[0];
        for(int i=0; i<prefix.length();i++){
            boolean match= true;
            for(String str:strs){
                if(str.length()<=i || str.charAt(i)!=prefix.charAt(i)){
                    match=false;
                    break;
                }
                
            }
            if(!match){
                break;
            }
            ans=ans+prefix.charAt(i);
        }
        return ans;
    }
}