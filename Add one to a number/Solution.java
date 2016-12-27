public class Solution {
	public ArrayList<Integer> plusOne(ArrayList<Integer> a) {
	    int i,ret, carry = 1, sum = 0,remainder =0;
	   Collections.reverse(a);
	    
	    for(i =0 ; i< a.size();i++)
	    {
	        ret = a.get(i);
	        ret = ret  + carry;
	        
	        if(ret >= 10)
	        {
	            ret = ret % 10;
	            carry = 1;
	        }
	        else 
	            carry = 0;
	        
	        a.remove(i);
	        a.add(i,ret);
	        
	        if(carry == 0)
	            break;
	    }
	    
	    if(carry == 1 && i== a.size() )
	    {
	       
	        a.add(a.size(),1);
	    }
	    
	    for(i = a.size() - 1;i >= 0; i--)
	    {
	        if(a.get(i) == 0)
	        {
	            a.remove(i);
	        }
	        else
	        {
	            break;
	        }
	    }
	   Collections.reverse(a);
	    return a;
	    
	}
}
