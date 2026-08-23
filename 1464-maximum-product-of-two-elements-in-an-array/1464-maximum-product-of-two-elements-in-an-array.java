class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int i=n-2;
        int j=n-1;
        return (nums[i]-1)*(nums[j]-1);
    }
}