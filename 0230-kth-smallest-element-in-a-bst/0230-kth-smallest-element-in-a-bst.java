class Solution {
    public void inorder(TreeNode root, int k,ArrayList<Integer> ans){
        if(root==null) return;
        inorder(root.left,k,ans);
        ans.add(root.val);
        inorder(root.right,k,ans);
        
    }
    public int kthSmallest(TreeNode root, int k) {
        
        ArrayList<Integer> ans=new ArrayList<>();
        
        inorder(root,k,ans);
        return ans.get(k-1);
    }
}