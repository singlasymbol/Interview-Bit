public class Solution1 {
    public TreeNode convert(final List<Integer> a,int low,int high,TreeNode root)
    {
        if(low > high)
            return null;
            
        int mid = (low + high)/2;
        TreeNode n = new TreeNode(a.get(mid));
        
        root = n;
        
        root.left = convert(a,low,mid - 1,root.left);
        root.right = convert(a,mid + 1,high,root.right);
        
        return root;
        
    }
	public TreeNode sortedArrayToBST(final List<Integer> a) {
	  //  System.out.println(a.size());
	    
	    TreeNode root ;
	    root = null;
	    
	    root =  convert(a,0,a.size() - 1,root);
	   return root;
	}
}