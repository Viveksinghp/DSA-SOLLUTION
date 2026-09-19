class Solution {
    public int[] twoSum(int[] nums, int x) {
//         int n = nums.length;
//         int ans[] = new int[2];
//         int sum = 0;
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 if (nums[i] + nums[j] == x) {
//                     ans[0] = i;
//                     ans[1] = j;
//                 }
//             }
//         }
//         return ans;
//     }
// }

        int [] ans={-1,-1};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int rem=x-nums[i];
            if(map.containsKey(rem)){
                int j=map.get(rem);
                ans[0]=i;
                ans[1]=j;
                break;
            }
            else map.put(nums[i],i);
        }
        return ans;
    }
}

// Two Pointer
//    int n=nums.length;
//    //int sum=0;
//    int i=0;
//    int j=n-1;
//    while(i<j){
//     int sum=a[i]+a[j];
//     if(sum==x){
//        return {i,j};
//     }
//     else if(sum<x){
//         i++;
//     }
//     else{
//         j++;
//     }
//    }
//    return 0;
   
//     }
// }    