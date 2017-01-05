public class Solution3 {
	public int Depth(TreeNode a) {
	
	    if(a == null)
	        return 0;
	       
	       if(a.right == null && a.left == null)
	        return 1;
	    if(a.right != null && a.left == null)
	        return 0;
	        
	    if(a.left != null && a.right == null)
	        return 0;
	        
	       
	    if(a.right != null && a.left != null)
	    {
	        int lDepth = Depth(a.left);
	        int rDepth = Depth(a.right);
	        
	        return 1 + Math.min(lDepth, rDepth);
	    }
	    
	    return 0;
	    
	}
	
	public int minDepth(TreeNode a)
	{
        if(a == null)
            return 0;
            
        if(a.left == null && a.right == null)
            return 1;
            
        int lDepth = a.left != null ? minDepth(a.left) : Integer.MAX_VALUE;
        
        int rDepth = a.right != null ? minDepth(a.right) : Integer.MAX_VALUE;
        
        return 1 + Math.min(lDepth,rDepth);
        
	}
}