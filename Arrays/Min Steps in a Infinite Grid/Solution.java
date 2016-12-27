public class Solution {
    // X and Y co-ordinates of the points in order.
    // Each point is represented by (X.get(i), Y.get(i))
    public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        
        int max = -1,diff_x = -1, diff_y = -1,sum= 0;
        
        for(int i =0 ;i < X.size() - 1; i++)
        {
            diff_x = Math.abs(X.get(i) - X.get(i + 1));
            diff_y = Math.abs(Y.get(i) - Y.get(i + 1));
            
            max = Math.max(diff_x, diff_y);
            
            sum = sum + max;
        }
        
    
        return sum;
    }
}
