public class Solution {
    // DO NOT MODIFY THE LIST
    
    public int binarySearch(List<Integer> a, int low, int high) {
        
        if(low > high) {
            return -1;
        }
        
        int mid = (low + high) / 2;
        
        if(mid == 0) {
            return a.get(mid);
        } 
        
        if(mid == a.size() - 1){
            return a.get(mid);
        }
        
        if(a.get(mid) < a.get(mid - 1) && a.get(mid) < a.get(mid + 1)) {
            return a.get(mid);
        }
        
        
        if(a.get(mid) > a.get(0)) {
            return  binarySearch(a, mid + 1, high);
        }
        
        return binarySearch(a, low, mid - 1);
    
    }
    
    public int findMin(final List<Integer> a) {
        
        if(a.get(0) < a.get(a.size() - 1)) {
            return a.get(0);
        }
        
        return binarySearch(a, 0, a.size() - 1);
    }
}
