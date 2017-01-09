/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    public void PathSum(TreeNode a, TreeNode parent)
    {
        if(a == null)
            return;
            
        a.val = parent.val - a.val;
        
        PathSum(a.left,a);
        PathSum(a.right, a);
         
    }
    
    private boolean inorder(TreeNode a)
    {
        if(a == null)
        {
            return false;
        }
        
        boolean left = inorder(a.left);
        if(a.left == null && a.right == null && a.val == 0)
        {
            return true;
        }
            
        boolean right = inorder(a.right);
        
        return left | right;
    
    }
    
	public int hasPathSum(TreeNode a, int b) 
	{
	    if(a.left == null && a.right == null )
	    {
	        if(a.val == b)
	            return 1;
	        
	        else 
	            return 0;
	    }
//	    System.out.println("Check1");
	    a.val = b - a.val;
	    
	    boolean l_ret = false;
	    boolean r_ret = false;
	    
	    if(a.left != null)
	    {
	         PathSum(a.left, a);
	    }
	    
//	    System.out.println("Check2");
	    if(a.right != null )
	    {
	        PathSum(a.right, a);
	    }
	       
	    boolean res = inorder(a);
	    if(res == true)
	        return 1;
	        
	   return 0;
	}
}