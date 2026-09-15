class Solution {
    int res=0;
    void path(TreeNode root,int sum){
        if(root==null) return;
        sum= sum*10 + root.val;
        if(root.left==null && root.right==null){
           res=res+sum;
           return;
        } 
        path(root.left,sum);
        path(root.right,sum);
    }
    public int sumNumbers(TreeNode root) {
        path(root,0);
        return res;
    }
}