public class Solution {
    
    public void invert(TreeNode a)
    {
        
        if(a == null)
            return;
        TreeNode temp1= null;
        TreeNode temp2 = null;
        
        if(a.left != null)
            temp1 = a.left;
        
        if(a.right != null)
            temp2 = a.right;
        
        a.left = temp2;
        a.right = temp1;
        
        invert(a.left);
        invert(a.right);
    }
    
    public void inorder(TreeNode a)
    {
 
        if(a != null)
        {
            inorder(a.left);
            System.out.print(a.val + " ");
            inorder(a.right);
        }
    }
    
    public int isIdentical(TreeNode a, TreeNode b)
    {
        
	    if(a == null && b == null)
	        return 1;
	        
	    if(a == null && b != null)
	        return 0;
	        
	    if(a != null && b == null)
	        return 0;
	        
	    if(a.val != b.val)
	        return 0;
	    
	    int left = isIdentical(a.left,b.left);
	    int right = isIdentical(a.right, b.right);
	    
	    if(left != right)
	    {
	        return 0;
	    }
	    
	    return 1;
    }
	public int isSymmetric(TreeNode a) {
	    
	    if(a.left == null && a.right == null)
	        return 1;
	        
	    if(a.left == null && a.right != null)
	        return 0;
	        
	    if(a.left != null && a.right == null)
	        return 0;
	        
	    if(a.left.val != a.right.val)
	        return 0;
	    
       
	    invert(a.right);
	    
        return isIdentical(a.left,a.right);
    
    }
}