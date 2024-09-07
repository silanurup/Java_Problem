# String Compression Solution

## Overview

The `Solution` class contains a method to compress a character array in-place by replacing consecutive duplicates with the character followed by the count of their occurrences. The method returns the new length of the array after compression.

## Method

### `compress(char[] chars)`

#### Description

The `compress` method compresses the input character array by replacing sequences of the same character with the character followed by the count of its occurrences. The compression is done in-place, and the method returns the length of the array after compression.

#### Parameters

- `char[] chars`: The array of characters to be compressed.

#### Returns

- `int`: The length of the compressed array.
![problem 1](https://github.com/user-attachments/assets/0122ea8c-5d79-47f4-a926-f71d3a646ae7)


# Increasing Triplet Subsequence Solution

## Overview

The `Solution` class contains a method to determine if there exists an increasing triplet subsequence within a given integer array. The method returns `true` if such a subsequence exists and `false` otherwise.

## Method

### `increasingTriplet(int[] nums)`

#### Description

The `increasingTriplet` method checks if there is a subsequence of three indices `i < j < k` in the input array where `nums[i] < nums[j] < nums[k]`. The method efficiently finds such a triplet by keeping track of the smallest and second smallest values encountered so far.

#### Parameters

- `int[] nums`: The input array of integers.

#### Returns

- `boolean`: `true` if there exists an increasing triplet subsequence, otherwise `false`.
![problem 2](https://github.com/user-attachments/assets/8def0513-dce0-404e-8b95-0bd0d15ae8d2)




