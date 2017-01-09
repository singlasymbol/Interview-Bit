/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
	
	public boolean isValid(TreeNode a, int max, int min)
	{
	    if(a == null)
	        return true;
	   
	    if(a.val <= min | a.val >= max)
	        return false;
	        
	   return (isValid(a.left,a.val,min) &&  isValid(a.right,max,a.val));     
	}
	public int isValidBST(TreeNode a) {
	    
	    int max = Integer.MAX_VALUE;
	    int min = Integer.MIN_VALUE;
	    
	    boolean ans = isValid(a,max,min);
	    
	    if(ans == true)
	    return 1;
	    
	    return 0;
	    
	}
}
