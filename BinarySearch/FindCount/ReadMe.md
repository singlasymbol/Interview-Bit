# Find Count

https://www.interviewbit.com/problems/count-element-occurence/

Given a sorted array of integers, find the number of occurrences of a given target value.
Your algorithm’s runtime complexity must be in the order of O(log n).
If the target is not found in the array, return 0

**Example : **
Given [5, 7, 7, 8, 8, 10] and target value 8,
return 2.


## Solution.java

In this solution, I try to find any occurence of the element. Whenever i get any, i traverse from its left and right, to find the border elements(first and last occurence of the element). And thus giving the result by subtracting the both left and right positions.


## Solution1.java

Here, i traverse the array simply like in binary search. As soon as, i get any element, increasing the count and calling binary search on both of its sides.
