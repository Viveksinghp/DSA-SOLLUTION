class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int breakidx = -1;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                breakidx = i;
                break;
            }

        }   
            if (breakidx == -1) {
                return true;
            }

            for (int i = breakidx + 1; i < n - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    return false;
                }
            }
        
        return nums[n - 1] <= nums[0];
    }
}