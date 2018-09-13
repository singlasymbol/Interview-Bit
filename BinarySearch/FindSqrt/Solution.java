public class Solution {
    
    long findSqrt(long low, long high, long a) {
        
        long mid = (low + high) / 2;
        
        long midDouble = mid * mid;
        long midPrevDouble = (mid - 1) * (mid - 1);
        
        if(midDouble == a) {
            return mid;
        }
        
        if(midDouble > a && midPrevDouble < a) {
            return mid - 1;
        }
        
        
        if(midDouble > a) {
            return findSqrt(low, mid - 1, a);
        }
        
        return findSqrt(mid + 1, high , a);
        
    }
    
    public int sqrt(int a) {
        Long res = findSqrt(0, Long.valueOf(a), Long.valueOf(a));
        return res.intValue();
    }
}
