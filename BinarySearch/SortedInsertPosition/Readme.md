## Sorted Insert Position

### Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.

[1,3,5,6], 5 → 2
[1,3,5,6], 2 → 1
[1,3,5,6], 7 → 4
[1,3,5,6], 0 → 0

## Solution

The idea is to find the elements with the following conditions.
1. If the value matches.
2. If the value to be found is less than the first element.
3. If the value to be found is greater than the last element.
4. If the value to be found is greater than the current value and lesser than the next value. (Return current + 1 here)
