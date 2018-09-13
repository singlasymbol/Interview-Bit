/* Given a sorted array of integers, find the number of occurrences of a given target value.
Your algorithm’s runtime complexity must be in the order of O(log n).
If the target is not found in the array, return 0

**Example : **
Given [5, 7, 7, 8, 8, 10] and target value 8,
return 2.

 
*/
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    
    public int binarySearch(List<Integer> A, int B, int low, int high) {
        if(low > high) {
            return -1;
        } 
        int mid = (low + high) /2;
        
        if(A.get(mid) == B) {
            return mid;
        }
        
        if(A.get(mid) > B) {
           return binarySearch(A, B, low, mid - 1);
        }
        
        return binarySearch(A, B, mid + 1, high);
    }
    
    public int searchLeft(List<Integer> A, int B, int low , int high) {
        // System.out.println("search left low " + low + " high " + high );
        if(low > high) {
            return -1;
        }
        
        int mid = (low + high) / 2;
        
        if(mid == 0 && A.get(mid) == B) {
            return 0;
        }
        
        if(A.get(mid) == B && A.get(mid - 1) < A.get(mid)) {
            return mid;
        }
        
        if(A.get(mid) < B) {
            return searchLeft(A, B, mid + 1, high);
        }
        
        return searchLeft(A, B, low, mid - 1);
    }
    
    public int searchRight(List<Integer> A, int B, int low , int high) {
        if(low > high) {
            return -1;
        }
        
        int mid = (low + high) / 2;
        
        if(mid == high && A.get(mid) == B) {
            return high;
        }
        
        if(A.get(mid) == B && A.get(mid + 1) > A.get(mid)) {
            return mid;
        }
        
        if(A.get(mid) > B) {
            return searchRight(A, B, low, mid - 1);
        }
        
        return searchRight(A, B, mid + 1, high);
    }
    
    public int findCount(final List<Integer> A, int B) {
        int position  = binarySearch(A, B, 0, A.size() - 1);
        
        if(position == -1 ){
            return 0;
        }
        int leftPosition = searchLeft(A, B, 0, position);
        
        int rightPosition = searchRight(A, B, position, A.size() - 1);
        
        // System.out.println("left Pos " + leftPosition + " right " + rightPosition);
        if(leftPosition == -1 || rightPosition == -1) {
            return 0;
        }
        return rightPosition - leftPosition + 1;
        
    }
}
