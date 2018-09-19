public class Solution {
    // DO NOT MODIFY THE LIST
    
    int findPivot(List<Integer> list, int low, int high) {
    
        if(low > high) {
            return -1;
        }    
        
        int mid = (low + high) / 2;
        
        if(mid == 0) {
            return mid;
        }
        
        if(mid == list.size() - 1) {
            return mid;
        }

        if(list.get(mid) < list.get(mid - 1) && list.get(mid) < list.get(mid + 1)) {
            return mid;
        }

        if(list.get(mid) < list.get(list.size() - 1)) {
            return findPivot(list, low, mid - 1);
        }

        return findPivot(list, mid + 1, high);
    }
    
    int binarySearch(List<Integer> list, int target, int low, int high) {
        if(low > high) {
            return -1;
        }

        int mid = (low + high) / 2;
        
        if(list.get(mid) == target) {
            return mid;
        }

        if(list.get(mid) > target) {
            return binarySearch(list, target, low, mid - 1);
        }

        return binarySearch(list, target, mid + 1, high);
    }
    
    
    public int search(final List<Integer> a, int b) {
        
        int index = 0;
        int low = 0;
        int high = a.size() - 1;
        
        if(a.get(low) > a.get(high)){
            index = findPivot(a, low, high);
        }else {
             return binarySearch(a, b, low, high);
        }        

        if(a.get(0) == b) {
            return 0;
        }
        
        if(a.get(high) == b) {
            return high;
        }

        if(a.get(0) > b) {
         return binarySearch(a, b, index, high);
        }

        return binarySearch(a, b, low, index);
    }
}
