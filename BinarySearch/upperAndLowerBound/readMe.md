## Given a sorted array of integers, find the starting and ending position of a given target value.

Your algorithm’s runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

Example:

Given [5, 7, 7, 8, 8, 10]

and target value 8,

return [3, 4].


### Solution

The idea is to find two elements-
1. one which has the target value and its left either does not exist or is lesser than it
2. Which has the target value and its right either does not exist or is greater than it
