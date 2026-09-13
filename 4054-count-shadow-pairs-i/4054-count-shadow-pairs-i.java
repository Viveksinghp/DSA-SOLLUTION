class Solution {
    public long shadowPairs(int[] nums) {
        Deque<int[]> stack=new ArrayDeque<>();
        long answer=0;
        long active=0;
        for(int num:nums){
            while(!stack.isEmpty() && stack.peek()[0]>num){
                active-=stack.pop()[1];
            }
            int equal=0;
            if(!stack.isEmpty() && stack.peek()[0]==num){
                equal=stack.peek()[1];
            }
            answer +=active-equal;
            if(equal > 0){
                stack.peek()[1]++;
            }
            else {
                stack.push(new int[] {num,1});
            }
            active++;
        }
        return answer;
    }
}