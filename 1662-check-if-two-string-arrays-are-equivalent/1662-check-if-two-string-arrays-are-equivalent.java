class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String ans1 = "";
        String ans2 = "";
        for (String str1 : word1) {
            ans1 = ans1 + str1;
        }
        for (String str2 : word2) {
            ans2 = ans2 + str2;
        }
        if(ans1.length()!=ans2.length()) return false;
        for (int i = 0; i < ans1.length(); i++) {
                if (ans1.charAt(i) != ans2.charAt(i)) {
                    return false;
                
            }
        }

        return true;
    }
}
