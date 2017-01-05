public class Solution {
	public int isSameTree(TreeNode a, TreeNode b) {
	    
	    if(a == null && b == null)
	        return 1;
	  
	    if(a == null && b!= null )
	        return 0;
	  
	    if(a != null && b == null )
	        return 0;
	  
	    if(a.val != b.val)
	        return 0;
	        
	   
	    int left = isSameTree(a.left, b.left);
	    int right = isSameTree(a.right,b.right);
	    
	    if(left == right)
	        return 1;
	        
	    if(left != right)
	          return 0;
	
	    return 1;
	}
}