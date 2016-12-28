public class Solution {
    
    public int g(int a,int b)
    {
        if(b == 0)
        return a;
        
        else
            return g(b, a%b );
    }
	public int gcd(int a, int b) {
        
        int x = Math.max(a,b);
        int y = Math.min(a,b);
        
        return g(x,y);
	}
}
