class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue;
            }
            char a=Character.toLowerCase(s.charAt(left));
            char b=Character.toLowerCase(s.charAt(right));
            
            if(a!=b){
                return false;
            }
            left++;
            right--;
        }
    
        return true;
    }
}