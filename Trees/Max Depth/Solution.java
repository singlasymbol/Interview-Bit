public class Solution {
	private int Depth(TreeNode A) {
 
     if(A == null)
        return 0;
        
    if(A.right == null && A.left == null)
        return 0;
        
    if(A.right != null && A.left == null)
    {
        return 1 + Depth(A.right);
    }
    
    
    if(A.left != null && A.right != null)
    {
        int lDepth = Depth(A.left);
        int rDepth = Depth(A.right);
        return 1 + Math.max(lDepth,rDepth);
    }
    
    return 1+ Depth(A.left);   
	}
	
    public int maxDepth(TreeNode A)
    {
        return 1+ Depth(A);
    }
}