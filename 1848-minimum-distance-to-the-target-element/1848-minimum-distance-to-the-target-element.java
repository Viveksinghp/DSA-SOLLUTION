class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n=nums.length;
        int i=0;
        int mindist=Integer.MAX_VALUE;

        while(i<n){
            if(nums[i]==target){
                mindist=Math.min(mindist,Math.abs(i-start));
                
            }
            i++;
        }
        return mindist;
    }
}