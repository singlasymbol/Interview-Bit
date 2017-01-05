public class Solution1 {
    public TreeNode invertTree(TreeNode root) {
        
        if(root == null)
            return null;
            
        TreeNode left_node;
        TreeNode right_node;
        
        left_node = invertTree(root.left);
        right_node = invertTree(root.right);
        
        root.left = right_node;
        root.right = left_node;
        
        return root;
        
    }
}