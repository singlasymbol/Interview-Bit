
 int height(TreeNode a)
 {
     if(a == null)
        return 0;
        
    return 1 + Math.max(height(a.left),height(a.right));
 }
 
	public int isBalanced(TreeNode a) {
	    
	    if(a == null)
	        return 1;
	        
	    int l_height = height(a.left);
	    int r_height = height(a.right);
	    
	    int diff = Math.abs(l_height - r_height);
	   // System.out.println(diff);
	    
	    if(diff > 1)
	        return 0;
	    
	        
	   int left = isBalanced(a.left);
	   int right = isBalanced(a.right);
	        
	   if(left == 0 | right == 0)
	   {
	       return 0;
	   }
	   return 1;
	}
}
