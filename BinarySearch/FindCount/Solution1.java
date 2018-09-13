public class Solution1 {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    
    public int findCount(List<Integer> A, int B, int low, int high) {
        
        if(low > high) {
            return 0;
        }

        int mid = (low + high) /2;

        if(A.get(mid) == B) {
            return 1 + (findCount(A, B, low, mid - 1)  + findCount(A, B, mid + 1, high));
        }

        if(A.get(mid) > B) {
            return findCount(A, B, low, mid - 1);
        }
        
        return findCount(A, B, mid + 1, high);
    }
    
    public int findCount(final List<Integer> A, int B) {
        return findCount(A, B, 0, A.size() - 1);   
    }
}
