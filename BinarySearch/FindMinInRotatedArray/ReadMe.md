# Find min in rotatedArray

## Problem 

https://www.interviewbit.com/problems/rotated-array/

Suppose a sorted array A is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

The array will not contain duplicates.

## Approach

The idea is to find the element which has greater element on both of the sides.

1. Check if the index element is smaller than the last element. that means, the index element is least. Because if the array is rotated the index element will be greater.

2. Check for element which has greater on both sides.

3. If any other comes, if it is greater the index element, then search in right side of it. Else search on left side. 
