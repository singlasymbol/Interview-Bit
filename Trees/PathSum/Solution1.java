×
/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution1 {
    
    public boolean PathSum(TreeNode a,int b)
    {
        if(a == null) return false;
        
        if(a.left == null && a.right == null)
        {
            return a.val == b;
        }
        
        int remaining = b - a.val;
        
        return PathSum(a.left, remaining) | PathSum(a.right , remaining);
        
    }
    
	public int hasPathSum(TreeNode a, int b) {
	    
	   if(PathSum (a, b) == true)
	       return 1;
	    
	    return 0;
	   
	}
}