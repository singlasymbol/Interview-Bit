public class Solution {
	// DO NOT MODFIY THE LIST. 
//points to lookout for- if list has only negative numbers.

	public int maxSubArray(final List<Integer> a) {
	    int i, sum =0 ,max = a.get(0) ;
	    
	    for(i =0 ;i < a.size(); i++)
	    {
	        sum = sum + a.get(i);
	        
	        
	        if(sum >  max)
	            max = sum;
	            
	        if(sum < 0)
	            sum = 0;
            
	    }
	    
	    return max;
	}
}
