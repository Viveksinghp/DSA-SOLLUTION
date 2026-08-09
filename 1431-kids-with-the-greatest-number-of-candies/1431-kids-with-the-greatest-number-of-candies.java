class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ans = new ArrayList<>();
        int maxcandies=Integer.MIN_VALUE;
        int n=candies.length;
        for(int i=0;i<n;i++){
            maxcandies=Math.max(maxcandies,candies[i]);
        }
       for (int j=0; j<n;j++){
            if(candies[j]+extraCandies>=maxcandies)
                ans.add(true);
            else ans.add(false);
            
        }
        return ans;
    }
}