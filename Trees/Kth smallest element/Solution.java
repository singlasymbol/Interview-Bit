public class Solution {
    void inorder(TreeNode root,ArrayList<Integer> a)
    {
        if(root != null)
        {
            inorder(root.left,a);
            a.add(root.val);
            inorder(root.right,a);
        }
    }
    
    public int kthsmallest(TreeNode root, int k) {
        
        ArrayList<Integer> a = new ArrayList<Integer>();    
    
        inorder(root,a);
        
        return a.get(k -1);
    }
}