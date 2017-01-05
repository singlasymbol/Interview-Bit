public class Solution {
	public int isSymmetric(TreeNode a) {
	    
	    if(a == null)
	        return 0;
	        
	    return isSame(a.left,a.right) ? 1 : 0;
	}
	
	public boolean isSame(TreeNode a, TreeNode b)
	{
	    if(a == null && b == null)
	        return true;
	        
	    if(a== null || b== null)
	        return false;
	
	   if(a.val != b.val)
	        return false;
	   
	   return (isSame(a.left,b.right) | isSame(a.right,b.left));
	}
}