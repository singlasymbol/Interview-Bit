public class Solution1 {
	public int maxDepth(TreeNode a) {
	    if(a== null)
	    return 0;
	    return 1+ (Math.max(maxDepth(a.left),maxDepth(a.right)));
	}
}
