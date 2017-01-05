public class Solution {
    public void invert(TreeNode a)
    {
        
        if(a == null)
            return;
        TreeNode temp1= null;
        TreeNode temp2 = null;
        
        if(a.left != null)
            temp1 = a.left;
        
        if(a.right != null)
            temp2 = a.right;
        
        a.left = temp2;
        a.right = temp1;
        
        invert(a.left);
        invert(a.right);
    }
    
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }
}