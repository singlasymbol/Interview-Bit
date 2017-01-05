public class Solution2 {
	public int minDepth(TreeNode a) {
	    
	    if(a.left == null && a.right == null)
	    {
	       // System.out.println("both null");
	            return 1;
	    
	    }
	    
	    if(a.left == null && a.right != null)
	    {
	           // System.out.println("left null");
	    
	        return 1 + minDepth(a.right);
	    }
	    
	    if(a.left != null && a.right == null)
	    {
	            //System.out.println("right null");
	    
	        return 1 + minDepth(a.left);
	    }
	    
	    
	    if(a.left != null && a.right != null)
	    {
	          //  System.out.println("both NOT null");
	    
	        return 1 + Math.min(minDepth(a.left),minDepth(a.right));
	    }
	    
	    return 0;
	    
	}
}