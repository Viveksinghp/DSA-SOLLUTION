class Solution {
    public long countCommas(long n) {
        long ans=0;
        long start=1000;
        while(start<=n){
            ans+=n-start +1;
            if(start > Long.MAX_VALUE /1000) break;
            start*=1000;
        }
        return ans;

    }
}