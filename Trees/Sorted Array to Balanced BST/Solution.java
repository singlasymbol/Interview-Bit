public class Solution {
    
    
    public TreeNode add(final List<Integer> a, int low, int high)
    {
        
        if(low > high)
            return null;
        
        int mid = (low + high )/2;
        
        TreeNode root = new TreeNode(a.get(mid));
        
        root.left = add(a,low,mid - 1);
        root.right = add(a, mid+ 1, high);
        
        return root;
    }
	public TreeNode sortedArrayToBST(final List<Integer> a) {
	    
	
	        TreeNode root = add(a,0,a.size() - 1);
	
	    return root;
	}
}