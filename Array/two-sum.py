# Given an array of integers, return the indices of two numbers that add up to a given target.
import numpy as np

arr = np.array([1, 6])

target = 7 

for p1 in range(len(arr)):
    for p2 in range(p1 + 1, len(arr)):
        if (arr[p1] + arr[p2]) == target:
            print("FOUND: p1 - ", p1, " p2 - ", p2)