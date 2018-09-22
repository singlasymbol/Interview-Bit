import java.util.*;
public class Solution {

    int low = -1;
    int high = -1;

    public void binarySearch(List<Integer> list, int target, int low, int high) {
        if(low > high) {
            return;
        }

        int mid = (low + high) / 2;

        if(list.get(mid) == target) {

            //if nothing is on the left
            if(mid == 0) {
                this.low = 0;
            }

            //if nothing is on the right
            if(mid == (list.size() - 1)){
                this.high = mid;
            }

            // if the left element is lesser. (first condition <<this.low == -1 >> stating that first element is not found yet)
            if(this.low == -1 && target > list.get(mid - 1)) {
                this.low = mid;
            } 

            // if the right element is greater. (first condition <<this.high == -1 >> stating that second element is not found yet)    
            if(this.high == -1 && target < list.get(mid + 1)) {
                this.high = mid;
            }

            // these will occur when you are in middle of duplicate elements 
            // for eg - 1 2 3 7 7 7 7 7 4 5 target - 7
            // if you are at mid of 7's , so calling both sides to find the border elements.

            if(this.low == -1) {
                binarySearch(list, target, low, mid - 1);
            }

            if(this.high == -1){
                binarySearch(list, target, mid + 1, high); 
            }

        }

        if(list.get(mid) > target) {
            binarySearch(list, target, low, mid - 1);
            return;
        }

        binarySearch(list, target, mid + 1, high); 
        return;
    }


    public ArrayList<Integer> searchRange(final List<Integer> list, int target) {

        binarySearch(list, target, 0, list.size() - 1);
        ArrayList<Integer> res = new ArrayList<Integer>();
        res.add(this.low);
        res.add(this.high);

        return res;
    }
}
