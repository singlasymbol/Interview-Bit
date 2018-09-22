# Matrix Search
## Write an efficient algorithm that searches for a value in an m x n matrix.

This matrix has the following properties:

### Integers in each row are sorted from left to right.
### The first integer of each row is greater than or equal to the last integer of the previous row.
Example:

Consider the following matrix:

[
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
Given target = 3, return 1 ( 1 corresponds to true )

Return 0 / 1 ( 0 if the element is not present, 1 if the element is present ) for this problem

## Solution Approach

The key is to find the row to search in. 

How to find the row?

Check if the target element to find is greater or equal to the current element and lesser than the first element in the next row.

Once row, is found. Do a binary search on it.
