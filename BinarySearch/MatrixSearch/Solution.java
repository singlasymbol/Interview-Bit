
public class Solution {

    Integer arraySize;
    Integer arrayHorizontalSize;

    Solution() {
        arraySize = null;
        arrayHorizontalSize = null;
    }

    public int getElem(ArrayList<ArrayList<Integer>> list, int row, int col) {
        return list.get(row).get(col);
    }

    public int getElem(ArrayList<ArrayList<Integer>> list, int row) {
        return list.get(row).get(0);
    }

    public int getVerticalSize(ArrayList<ArrayList<Integer>> list) {
        if(arraySize == null) {
            this.arraySize = list.size();
        }
        return this.arraySize;
    }

    public int getHorizontalSize(ArrayList<ArrayList<Integer>> list) {
        if(this.arrayHorizontalSize == null) {
            this.arrayHorizontalSize = list.get(0).size();
        }
        return this.arrayHorizontalSize;
    }

    public int getRow(ArrayList<ArrayList<Integer>> list, int target, int low, int high) {
        if(low > high) {
            return -1;
        }

        int mid = (low + high)/2;


        //Edge case;
        if(mid == this.arraySize - 1) {
            if(getElem(list, mid, this.arrayHorizontalSize - 1) < target) {
                return -1;
            }
            return mid;
        }

        //handle index out of bounds
        // checking (<=) for first as the first elem can be there, but for the next rows first elem checking only if lesser.
        if(getElem(list, mid) <= target && getElem(list, mid + 1) > target) {
            if(getElem(list, mid, this.arrayHorizontalSize - 1) < target) {
                return -1;
            }
            return mid;
        }

        if(getElem(list, mid) < target) {
            return getRow(list, target, mid + 1, high);
        }

        return getRow(list, target, low, mid - 1);
    }

    public int searchInRow(ArrayList<Integer> list, int target, int low, int high) {
        if(low > high) {
            return 0;
        }

        int mid = (low + high) / 2;
        
        if(target == list.get(mid)) {
            return 1;
        }

        if(target > list.get(mid) ) {
            return searchInRow(list, target, mid + 1, high);
        }

        return searchInRow(list, target, low, mid - 1);
    }

    public int searchMatrix(ArrayList<ArrayList<Integer>> list, int target) {
        
        int arrSize = getVerticalSize(list);
 
        if(arrSize == 0) {
            return 0;
        }

        int horizontalSize = getHorizontalSize(list);

        int firstRowFirstElement = getElem(list, 0);
        
        if(target < firstRowFirstElement) {
            return 0;
        }
        
        int row = getRow(list, target, 0, arraySize - 1);

        if(row == -1) {
            return 0;
        }

        return searchInRow(list.get(row), target, 0, this.arrayHorizontalSize - 1);
        
    }
}