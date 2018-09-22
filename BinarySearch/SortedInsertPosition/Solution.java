public class Solution {

    public int binarySearch(ArrayList<Integer> list, int target, int low, int high) {
        //wont come here. since all cases will be handled
        if(low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if(list.get(mid) == target) {
            return mid;
        }

        if(mid == 0 && list.get(mid) > target) {
            return 0;
        }

        if(mid == (list.size() - 1) && list.get(mid) < target) {
            return mid + 1;
        }

        if(list.get(mid) < target && list.get(mid + 1) > target) {
            return mid + 1;
        }

        if(list.get(mid) > target) {
            return binarySearch(list, target, low, mid - 1);
        }

        return binarySearch(list, target, mid + 1, high);
    }

    public int searchInsert(ArrayList<Integer> list, int target) {
        return binarySearch(list, target, 0, list.size() - 1);
    }
}
