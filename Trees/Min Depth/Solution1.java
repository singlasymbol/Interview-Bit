public class Solution1 {
	public int minDepth(TreeNode a) {
	    
	    if(a == null)
	        return Integer.MAX_VALUE;
	        
	    if(a.left == null && a.right == null)
	    {
	           return 1;
	    }
	    
	     return 1 + Math.min(minDepth(a.left),minDepth(a.right));
	}
}	