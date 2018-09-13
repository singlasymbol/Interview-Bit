# Find min in rotatedArray

#Approach

The idea is to find the element which has greater element on both of the sides.

1. Check if the index element is smaller than the last element. that means, the index element is least. Because if the array is rotated the index element will be greater.

2. Check for element which has greater on both sides.

3. If any other comes, if it is greater the index element, then search in right side of it. Else search on left side. 
