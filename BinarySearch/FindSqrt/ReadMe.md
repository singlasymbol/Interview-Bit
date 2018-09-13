# Find Square Root of a number

## Problem

https://www.interviewbit.com/problems/square-root-of-integer/

Implement int sqrt(int x).

Compute and return the square root of x.

If x is not a perfect square, return floor(sqrt(x))

Example :

Input : 11
Output : 3

## Approach

The idea is to start checking by the half of the number. 

If the square of half is greater then search from half's half, else search in (number + half) /2.

<b> Note </b> - Since we have to find the floor of the square root, keep a check for a condition where x's square is greater and (x-1)'s square is lesser than number, then this (x - 1 will be the answer).
x = number / 2.