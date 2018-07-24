// Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int trap(final List<Integer> A) {
        
        int [] left = new int[A.size()];
        int [] right = new int[A.size()];
        
        left[0] = A.get(0);
        for(int i = 1; i < A.size(); i++) {
            left[i] = Math.max(left[i - 1], A.get(i));
        }
        
        right[A.size() - 1] = A.get(A.size() - 1);
        for(int i = A.size() -2 ;i >=0 ;i--) {
            right[i] = Math.max(right[i + 1], A.get(i));
        }
        
        int water = 0;
        for(int i = 0; i < A.size(); i++) {
            water = water + (Math.min(left[i],right[i]) - A.get(i));
        }
        
        return water;
    }
}
