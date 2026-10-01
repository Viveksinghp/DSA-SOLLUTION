class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> set=new Stack<>();
        char ch[]=s.toCharArray();
        for(char c:ch){
            if(c=='(' || c=='{' || c=='['){
                set.push(c);
            }
            else{
                if(set.isEmpty()) return false;
            
            char top=set.pop();
            if((c==')' && top!='(') || (c=='}' && top!='{') || (c==']' && top!='[')){
                return false;
            }
        }
        }
        return set.isEmpty();
    }
}