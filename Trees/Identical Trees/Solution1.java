public class Solution1 {
 
 /*ArrayList<Integer> A = new ArrayList<Integer>();
 ArrayList<Integer> B = new ArrayList<Integer>();
	public int isSameTree(TreeNode a, TreeNode b) {
	        ainorder(a);
	        binorder(b);
	int i;
	    if(A.size() != B.size())
	    {
	        return 0;
	    }
	    for(i = 0 ; i< A.size();i++)
	    {
	        if(A.get(i) != B.get(i))
	        {
	            return 0;
	        }
	    }
	    
	    return 1;
	}
	
	public void ainorder(TreeNode x)
	{
	    if(x != null)
	    {
	        ainorder(x.left);
	        A.add(x.val);
	        ainorder(x.right);
	    }
	}
 
    public void binorder(TreeNode x)
	{
	    if(x != null)
	    {
	        binorder(x.left);
	        B.add(x.val);
	        binorder(x.right);
	    }
	}
	*/
	public int isSameTree(TreeNode a, TreeNode b) 
	{
	    if(a == null && b == null)
	    return 1;
		    
		if(a == null || b==null)
		return 0;
		
		if(a.val != b.val)
		 return 0;
	
	    int k = isSameTree(a.left,b.left);
	    int y = isSameTree(a.right,b.right);
		
		 if( k == 1 && y == 1)
		 {
		     return 1;
		 }
		 
		 return 0;
		     
	}
}