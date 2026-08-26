class Solution {
    public void dfs(TreeNode root,String path, ArrayList<String>ans){
        if(root==null) return;
        path+=root.val;
        if(root.left==null && root.right==null){
            ans.add(path);
            return;
        }
        dfs(root.left,path + "->",ans);
        dfs(root.right,path + "->",ans);
    }
    public List<String> binaryTreePaths(TreeNode root) {
       ArrayList<String> ans=new ArrayList<>();
    dfs(root,"",ans);
    return ans;
    }
}