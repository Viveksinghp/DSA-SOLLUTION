class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
      int n=nums.length;
      int low=0;
      int high=n-1;
      int mid=low + (high - low)/2;
      for(int i=mid-1; i>=low;i--){
        if(nums[mid]==nums[i]) return false;
      }
      for(int i=mid + 1;i<=high ;i++){
        if(nums[mid]==nums[i]) return false;
      }
      return true;
    }
}