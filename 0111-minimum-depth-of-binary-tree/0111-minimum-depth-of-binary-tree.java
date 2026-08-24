class Solution {
    private static int minheight(TreeNode root){
        if(root==null) return 0;
        if(root.left==null) return 1 +minheight(root.right);
        if(root.right==null) return 1 + minheight(root.left);
        return 1 + Math.min(minheight(root.left),minheight(root.right));
    }
    public int minDepth(TreeNode root) {
        
       return minheight(root); 
    }
}