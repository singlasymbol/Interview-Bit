public class Solution {
	public boolean isPalindrome(int a) {
	    
	    String s = Integer.toString(a);
	    
	    int len = s.length();
        for(int i = 0; i< len /2;i++)
        {
            if(s.charAt(i) != s.charAt(len - i -1))
                return false;
        }

	    return true;
	}
}
